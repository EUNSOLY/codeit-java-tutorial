# 🦸 Hero Manager

> Java 객체지향 프로그래밍과 CRUD 구현을 위한 RPG Hero 관리 시스템

---

# 🎯 프로젝트 목표

본 프로젝트를 통해 다음의 내용을 학습합니다.

- Git과 GitHub을 활용하여 프로젝트를 관리할 수 있다.
- RPG 게임의 도메인 모델을 설계하고 Java로 구현할 수 있다.
- 인터페이스를 설계하고 구현체를 구현할 수 있다.
- 추상 클래스와 인터페이스를 활용하여 객체지향 설계를 적용할 수 있다.
- Java Collections Framework(JCF)를 이용하여 데이터를 생성, 조회, 수정, 삭제할 수 있다.
- Stream API를 이용하여 데이터를 조회하고 정렬할 수 있다.
- Repository와 Service 계층을 분리하여 역할에 맞는 구조를 설계할 수 있다.
- (심화) 서비스 간 의존 관계를 이해하고 팩토리 패턴을 활용하여 의존성을 관리할 수 있다.

---

# 📌 프로젝트 마일스톤

- [ ] 프로젝트 초기화
- [ ] Hero 도메인 구현
- [ ] Monster 도메인 구현
- [ ] Quest 도메인 구현
- [ ] Repository 구현
- [ ] Service 구현
- [ ] CRUD 구현
- [ ] Stream API 구현
- [ ] Hero와 Monster 전투 구현
- [ ] Quest 수행 구현
- [ ] 의존성 주입
- [ ] 테스트

---

# 📋 요구사항

## 1. 프로젝트 초기화

### 프로젝트 생성

- [ ] IntelliJ에서 Java 프로젝트를 생성합니다.
- [ ] Create Git Repository는 체크하지 않습니다.
- [ ] Build System은 **Gradle(Groovy)** 를 사용합니다.
- [ ] JDK는 **17**을 사용합니다.
- [ ] GroupId는 `com.sprint.mission`을 사용합니다.
- [ ] `.gitignore`에 IntelliJ 관련 파일을 추가합니다.

```gitignore
.idea
```

---

# 🏹 도메인 모델링

패키지

```text
com.sprint.mission.hero.entity
```

Hero, Monster, Quest는 RPG 게임을 구성하는 핵심 도메인입니다.

- **Hero** : 플레이어가 조작하는 캐릭터
- **Monster** : Hero가 전투를 수행하는 대상
- **Quest** : Hero가 수행해야 하는 임무

모든 도메인은 UUID를 통해 식별되는 Entity입니다.

---

## 공통(Entity)

모든 도메인은 다음 필드를 공통으로 가집니다.

| 필드        | 타입   | 설명     |
|-----------|------|--------|
| id        | UUID | 객체 식별자 |
| createdAt | Long | 생성 시간  |
| updatedAt | Long | 수정 시간  |

### 생성자

- id는 UUID.randomUUID()로 생성합니다.
- createdAt은 생성 시 현재 시간을 저장합니다.
- updatedAt은 null로 초기화합니다.
- 나머지 필드는 생성자의 파라미터를 통해 초기화합니다.

### 메서드

- Getter
- update()

---

# 🦸 Hero

> 플레이어가 직접 조작하는 캐릭터입니다.

몬스터를 처치하고 퀘스트를 수행하며 성장합니다.

### 필드

| 필드        | 타입     | 설명       |
|-----------|--------|----------|
| id        | UUID   | Hero 식별자 |
| name      | String | 이름       |
| level     | int    | 레벨       |
| hp        | int    | 체력       |
| attack    | int    | 공격력      |
| gold      | int    | 보유 골드    |
| createdAt | Long   | 생성 시간    |
| updatedAt | Long   | 수정 시간    |

### Behavior

| 메서드                    | 설명         |
|------------------------|------------|
| levelUp()              | 레벨 증가      |
| earnGold(int gold)     | 골드 획득      |
| takeDamage(int damage) | 피해를 입음     |
| heal(int hp)           | 체력 회복      |
| update(...)            | Hero 정보 수정 |

---

# 👹 Monster

> Hero가 전투를 통해 처치해야 하는 몬스터입니다.

### 필드

| 필드         | 타입     | 설명          |
|------------|--------|-------------|
| id         | UUID   | Monster 식별자 |
| name       | String | 이름          |
| hp         | int    | 체력          |
| attack     | int    | 공격력         |
| rewardGold | int    | 처치 보상       |
| createdAt  | Long   | 생성 시간       |
| updatedAt  | Long   | 수정 시간       |

### Behavior

| 메서드                    | 설명         |
|------------------------|------------|
| takeDamage(int damage) | 피해를 입음     |
| update(...)            | Monster 수정 |

---

# 📜 Quest

> Hero가 수행하는 임무입니다.

### 필드

| 필드          | 타입      | 설명         |
|-------------|---------|------------|
| id          | UUID    | Quest 식별자  |
| title       | String  | 퀘스트 이름     |
| description | String  | 설명         |
| heroId      | UUID    | 수행 Hero    |
| monsterId   | UUID    | 대상 Monster |
| completed   | boolean | 완료 여부      |
| createdAt   | Long    | 생성 시간      |
| updatedAt   | Long    | 수정 시간      |

### Behavior

| 메서드         | 설명       |
|-------------|----------|
| complete()  | 완료 처리    |
| update(...) | Quest 수정 |

---

# 📦 Repository 설계

패키지

```text
com.sprint.mission.hero.repository
```

Repository는 **데이터 저장소의 역할**을 담당합니다.

각 Repository는 Java Collections Framework(HashMap)를 이용하여 데이터를 저장합니다.

예시

``` text
ArcherHeroRepository
MageHeroRepository
WarriorHeroRepository
GoblinRepository
QuestRepository
```

공통 기능

```java
save();

findById();

findAll();

update();

delete();
```

---

# 🛠 Service 설계

패키지

```text
com.sprint.mission.hero.service
```

Service는 Repository를 이용하여 **비즈니스 로직을 수행**합니다.

예를 들어

- Hero 생성
- Quest 완료
- Hero와 Monster 전투
- Hero 레벨업
- Stream 조회

등의 역할을 담당합니다.

---

# ▶️ 메인 클래스 구현

```text
DemoApplication
```

메인 메서드에서 다음 기능을 테스트합니다.

## Hero

- [ ] 생성
- [ ] 단건 조회
- [ ] 전체 조회
- [ ] 수정
- [ ] 삭제

## Monster

- [ ] 생성
- [ ] 단건 조회
- [ ] 전체 조회
- [ ] 수정
- [ ] 삭제

## Quest

- [ ] 생성
- [ ] 단건 조회
- [ ] 전체 조회
- [ ] 완료
- [ ] 삭제

---

# 🔍 Stream API 요구사항

## Hero

- [ ] 레벨 높은 순 조회
- [ ] 골드 높은 순 조회
- [ ] 레벨 10 이상 조회
- [ ] 이름 검색

## Monster

- [ ] 공격력 높은 순 조회
- [ ] 보상 높은 순 조회

## Quest

- [ ] 완료된 Quest 조회
- [ ] 미완료 Quest 조회
- [ ] Hero별 Quest 조회

---

# ⭐ 심화 요구사항

## Hero가 Quest 수행

```java
completeQuest(heroId, questId)
```

검증

- Hero 존재
- Quest 존재
- 완료 여부 확인
- Hero 일치 여부 확인

성공

- Quest 완료
- Hero Gold 증가
- Hero Level 증가
- updatedAt 변경

---

## Hero와 Monster 전투

```java
battle(heroId, monsterId)
```

전투

- Hero 선공
- Monster 반격
- HP 감소
- 둘 중 HP가 0 이하가 될 때까지 반복

승리

- Gold 획득
- Level Up 확인

패배

- Hero HP = 0

---

# 💉 의존성 주입

Service는 Repository를 생성자를 통해 주입받습니다.

```java
public HeroService(
        HeroRepository repository
)
```

QuestService는 HeroRepository와 MonsterRepository를 함께 사용할 수 있습니다.

```java
public QuestService(
        HeroRepository heroRepository,
        MonsterRepository monsterRepository,
        QuestRepository questRepository
)
```

---

# 🚀 추가 도전 과제

- [ ] Item 시스템
- [ ] Inventory
- [ ] Equipment
- [ ] Hero 경험치
- [ ] 직업 시스템
- [ ] 스킬 시스템
- [ ] 보스 몬스터
- [ ] 던전 시스템
- [ ] JSON 저장 및 불러오기

---

# ✅ 최종 구현 체크리스트

## 기본

- [ ] 프로젝트 생성
- [ ] Hero 구현
- [ ] Monster 구현
- [ ] Quest 구현
- [ ] Repository 구현
- [ ] Service 구현
- [ ] CRUD 구현
- [ ] 메인 테스트

## Stream API

- [ ] 정렬
- [ ] 검색
- [ ] 조건 조회

## 심화

- [ ] Quest 수행
- [ ] Hero와 Monster 전투
- [ ] 의존성 주입

---

# 🎮 예시 실행 결과

```text
========== Hero 생성 ==========
Hero : Arthur Lv.1

========== Monster 생성 ==========
Monster : Goblin

========== Quest 생성 ==========
Quest : Goblin Hunt

========== 전투 ==========
Arthur attacks Goblin!
Goblin attacks Arthur!

Arthur Win!

+ Gold 100
Level Up!

========== Quest 완료 ==========
Quest Complete!
```

---

> **Happy Coding! 🦸⚔️**
> 객체지향 설계와 Repository-Service 계층 구조를 RPG 프로젝트를 통해 학습해보세요.