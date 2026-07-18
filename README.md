# 🦸 Hero Manager

> Java 객체지향 프로그래밍과 CRUD 구현을 위한 RPG Hero 관리 시스템

---

# 🎯 프로젝트 목표

본 프로젝트를 통해 다음의 내용을 학습합니다.

- Git과 GitHub을 활용하여 프로젝트를 관리할 수 있다.
- RPG 게임의 도메인 모델을 설계하고 Java로 구현할 수 있다.
- 인터페이스를 설계하고 구현체를 구현할 수 있다.
- 싱글톤 패턴을 구현할 수 있다.
- Java Collections Framework(JCF)를 이용하여 데이터를 생성, 조회, 수정, 삭제할 수 있다.
- Stream API를 이용하여 데이터를 조회하고 정렬할 수 있다.
- (심화) 서비스 간 의존 관계를 이해하고 팩토리 패턴을 활용하여 의존성을 관리할 수 있다.

---

# 📌 프로젝트 마일스톤

- [ ] 프로젝트 초기화
- [ ] Hero 도메인 구현
- [ ] Monster 도메인 구현
- [ ] Quest 도메인 구현
- [ ] 서비스 인터페이스 설계
- [ ] CRUD 구현
- [ ] JCF 기반 저장소 구현
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

- **Hero** : 플레이어가 조작하는 캐릭터입니다.
- **Monster** : Hero가 전투를 수행하는 대상입니다.
- **Quest** : Hero가 수행해야 하는 임무입니다.

모든 도메인은 공통적으로 Entity의 역할을 가지며 UUID를 통해 식별됩니다.

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
>
> 몬스터를 처치하고 퀘스트를 수행하여 성장하며,
>
> 골드를 획득하고 레벨을 올릴 수 있습니다.

### 필드

| 필드        | 타입     | 설명           |
|-----------|--------|--------------|
| id        | UUID   | Hero의 고유 식별자 |
| name      | String | Hero 이름      |
| level     | int    | 현재 레벨        |
| hp        | int    | 현재 체력        |
| attack    | int    | 공격력          |
| gold      | int    | 보유 골드        |
| createdAt | Long   | 생성 시간        |
| updatedAt | Long   | 수정 시간        |

### 메서드(Behavior)

| 메서드                    | 설명                 |
|------------------------|--------------------|
| levelUp()              | Hero의 레벨을 증가시킵니다.  |
| earnGold(int gold)     | 골드를 획득합니다.         |
| takeDamage(int damage) | 공격을 받아 체력을 감소시킵니다. |
| heal(int hp)           | 체력을 회복합니다.         |
| update(...)            | Hero 정보를 수정합니다.    |

---

# 👹 Monster

> Hero가 전투를 통해 처치해야 하는 몬스터입니다.
>
> 몬스터마다 체력, 공격력, 보상이 다르며,
> 처치하면 Hero가 보상을 획득합니다.

## 필드

| 필드         | 타입     | 설명              |
|------------|--------|-----------------|
| id         | UUID   | Monster의 고유 식별자 |
| name       | String | 몬스터 이름          |
| hp         | int    | 체력              |
| attack     | int    | 공격력             |
| rewardGold | int    | 처치 시 획득하는 골드    |
| createdAt  | Long   | 생성 시간           |
| updatedAt  | Long   | 수정 시간           |

### 행위(Behavior)

| 메서드                    | 설명                 |
|------------------------|--------------------|
| takeDamage(int damage) | 공격을 받아 체력이 감소합니다.  |
| update(...)            | Monster 정보를 수정합니다. |

---

# 📜 Quest

> Hero가 수행해야 하는 임무입니다.
>
> Quest는 특정 Hero에게 할당되며,
> 특정 Monster를 처치하는 등의 목표를 가질 수 있습니다.

## 필드

| 필드          | 타입      | 설명             |
|-------------|---------|----------------|
| id          | UUID    | Quest의 고유 식별자  |
| title       | String  | 퀘스트 이름         |
| description | String  | 퀘스트 설명         |
| heroId      | UUID    | 퀘스트를 수행하는 Hero |
| monsterId   | UUID    | 처치 대상 Monster  |
| completed   | boolean | 완료 여부          |
| createdAt   | Long    | 생성 시간          |
| updatedAt   | Long    | 수정 시간          |

### 행위(Behavior)

| 메서드         | 설명                 |
|-------------|--------------------|
| complete()  | 퀘스트를 완료 상태로 변경합니다. |
| update(...) | Quest 정보를 수정합니다.   |

---

# 🛠 서비스 설계

패키지

```text
com.sprint.mission.hero.service
```

서비스 인터페이스

- HeroService
- MonsterService
- QuestService

---

## CRUD

모든 서비스는 아래 기능을 제공합니다.

```java
create();

find();

findAll();

update();

delete();
```

---

# 💾 서비스 구현

패키지

```text
com.sprint.mission.hero.service.jcf
```

구현체

- JCFHeroService
- JCFMonsterService
- JCFQuestService

---

### 저장소

Java Collections Framework를 사용하여 데이터를 저장합니다.

```java
private final Map<UUID, Hero> data;

private final Map<UUID, Monster> data;

private final Map<UUID, Quest> data;
```

- 생성자에서 초기화합니다.
- HashMap을 사용합니다.

---

# ▶️ 메인 클래스 구현

```text
JavaApplication
```

메인 메서드에서 다음 기능을 테스트합니다.

## Hero

- [ ] 생성
- [ ] 단건 조회
- [ ] 전체 조회
- [ ] 수정
- [ ] 수정 확인
- [ ] 삭제
- [ ] 삭제 확인

---

## Monster

- [ ] 생성
- [ ] 단건 조회
- [ ] 전체 조회
- [ ] 수정
- [ ] 수정 확인
- [ ] 삭제
- [ ] 삭제 확인

---

## Quest

- [ ] 생성
- [ ] 단건 조회
- [ ] 전체 조회
- [ ] 수정
- [ ] 완료 처리
- [ ] 삭제
- [ ] 삭제 확인

---

# 🔍 Stream API 요구사항

## Hero

- [ ] 레벨 높은 순 조회
- [ ] 골드 높은 순 조회
- [ ] 레벨 10 이상 Hero 조회
- [ ] 이름 검색

---

## Monster

- [ ] 공격력 높은 순 조회
- [ ] 보상 높은 순 조회

---

## Quest

- [ ] 완료된 Quest 조회
- [ ] 미완료 Quest 조회
- [ ] 특정 Hero의 Quest 조회

---

# ⭐ 심화 요구사항

## Hero가 Quest 수행

메서드

```java
completeQuest(heroId, questId)
```

### 검증

- [ ] Hero 존재 여부
- [ ] Quest 존재 여부
- [ ] 이미 완료된 Quest인지 확인
- [ ] Quest의 Hero와 동일한 Hero인지 확인

### 성공

- Quest 완료
- Hero Gold 증가
- Hero Level 증가
- updatedAt 변경

---

# ⚔ Hero와 Monster 전투

메서드

```java
battle(heroId, monsterId)
```

### 검증

- Hero 존재
- Monster 존재

### 전투

- Hero가 먼저 공격합니다.
- Monster가 반격합니다.
- HP를 감소시킵니다.
- 둘 중 한 명의 HP가 0 이하가 될 때까지 반복합니다.

### 승리

- Gold 획득
- 레벨업 조건 확인

### 패배

- Hero HP = 0

---

# 💉 의존성 주입

QuestService는 HeroService와 MonsterService를 생성자를 통해 주입받습니다.

```java
public JCFQuestService(
        HeroService heroService,
        MonsterService monsterService
)
```

---

# 🏭 팩토리 패턴 (심화)

ServiceFactory를 구현합니다.

```java
HeroService heroService();

MonsterService monsterService();

QuestService questService();
```

Main에서는 Factory를 이용하여 객체를 생성합니다.

```java
ServiceFactory factory = new ServiceFactory();

HeroService heroService = factory.heroService();

MonsterService monsterService = factory.monsterService();

QuestService questService = factory.questService();
```

---

# 🚀 추가 도전 과제

- [ ] Item 시스템
- [ ] Inventory 구현
- [ ] Equipment 구현
- [ ] Hero 경험치 시스템
- [ ] 직업(Warrior, Mage, Archer)
- [ ] 스킬 시스템
- [ ] 포션 사용
- [ ] 보스 몬스터
- [ ] 던전 시스템
- [ ] 랭킹 시스템
- [ ] JSON 저장 및 불러오기

---

# 📂 패키지 구조

```text
com.sprint.mission.hero
│
├── entity
│   ├── Hero.java
│   ├── Monster.java
│   └── Quest.java
│
├── service
│   ├── HeroService.java
│   ├── MonsterService.java
│   └── QuestService.java
│
├── service.jcf
│   ├── JCFHeroService.java
│   ├── JCFMonsterService.java
│   └── JCFQuestService.java
│
├── factory
│   └── ServiceFactory.java
│
└── JavaApplication.java
```

---

# ✅ 최종 구현 체크리스트

## 기본 기능

- [ ] 프로젝트 생성
- [ ] Hero 구현
- [ ] Monster 구현
- [ ] Quest 구현
- [ ] CRUD 구현
- [ ] JCF 저장소 구현
- [ ] 메인 테스트

---

## Stream API

- [ ] 정렬
- [ ] 검색
- [ ] 조건 조회

---

## 심화 기능

- [ ] Quest 수행
- [ ] Hero와 Monster 전투
- [ ] 의존성 주입
- [ ] 팩토리 패턴

---

## 도전 과제

- [ ] Inventory
- [ ] Equipment
- [ ] Item
- [ ] Boss Monster
- [ ] Dungeon
- [ ] JSON 저장
- [ ] JSON 불러오기

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
> 객체지향 설계와 Java의 핵심 개념을 RPG 프로젝트를 통해 재미있게 학습해보세요.