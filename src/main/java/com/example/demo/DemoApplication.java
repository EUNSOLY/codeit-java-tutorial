package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.AgilityHeroRepository;
import com.example.demo.hero.common.Hero;
import com.example.demo.hero.common.HeroRepository;
import com.example.demo.prices.JapanPaymentPrice;
import com.example.demo.prices.KoreaPaymentPrice;
import com.example.demo.prices.OriginalPrice;

//@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        
//        HeroRepository heroRepository = new AgilityHeroRepository();
//        Hero selectedHero = heroRepository.findByName("Slark");
//        selectedHero.attack();
//        heroRepository.delete("Slark");
//        Hero selectedHero2 = heroRepository.findByName("Slark");
//
//        String name = "하리보 젤리";
//        int price = 2500;
//        int deliveryPrice = 2500;


//        // OriginalPrice : 부모 클래스
//        // PaymentPrice : 자식 클래스 <- OriginalPrice : 부모 클래스를 상속받음
//        부모 클래스 (타입의) 변수 = 자식 클래스 (타입의) 객
//        OriginalPrice parent = new KoreaPaymentPrice(name, price, deliveryPrice);
        // ** 다형성 ** : 갈아끼울 수 있게끔 상위 클래스 / 인터페이스라고하는 아량넓은 변수 타입을 사용
        // 하나의 상위 클래스 / 인터페이스로 -> 다양한 하위 클래스 객체를 담아서 호출하는것
//      OriginalPrice parent = new KoreaPaymentPrice(name, price, deliveryPrice);
//                             = new JapanPaymentPrice(name, price, deliveryPrice);

//        parent.display();
//        System.out.println(paymentPrice.price);
//        System.out.println(paymentPrice.name);
    }
}
