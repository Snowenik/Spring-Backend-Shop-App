package com.shop;


import com.shop.entities.Product;
import com.shop.entities.ProductRepository;
import com.shop.enums.ProductCategory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class LoadDatabase {


    @Bean
    public CommandLineRunner addProducts(ProductRepository productRepository) {
        return args -> {

            Product pavilion15 = new Product();
            pavilion15.setName("Pavilion 15");
            pavilion15.setBasket(null);
            pavilion15.setValue(new BigDecimal(3200));
            pavilion15.setImage("pavilion15_HP_3200.jpg");
            pavilion15.setInStock(true);
            pavilion15.setDescription("HP Pavilion 15 Ryzen 7-4700/16GB/960/Win10 White");
            pavilion15.setBrand("HP");
            pavilion15.setCategory(ProductCategory.LAPTOP);
            pavilion15.setTransaction(null);
            productRepository.save(pavilion15);


            Product victusRyzen7 = new Product();
            victusRyzen7.setName("Victus Ryzen 7");
            victusRyzen7.setBasket(null);
            victusRyzen7.setValue(new BigDecimal(5949));
            victusRyzen7.setImage("victusRyzen7_HP_5949.jpg");
            victusRyzen7.setInStock(true);
            victusRyzen7.setDescription("HP Victus Ryzen 7-5800H/16GB/960 RTX3060 144Hz");
            victusRyzen7.setBrand("HP");
            victusRyzen7.setCategory(ProductCategory.LAPTOP);
            victusRyzen7.setTransaction(null);
            productRepository.save(victusRyzen7);

            Product nitro5 = new Product();
            nitro5.setName("Nitro 5");
            nitro5.setBasket(null);
            nitro5.setValue(new BigDecimal(3549));
            nitro5.setImage("nitro5_Acer_3549.jpg");
            nitro5.setInStock(true);
            nitro5.setDescription("Acer Nitro 5 i5-10300H/8GB/512/W10 GTX1660Ti 144Hz");
            nitro5.setBrand("Acer");
            nitro5.setCategory(ProductCategory.LAPTOP);
            nitro5.setTransaction(null);
            productRepository.save(nitro5);

            Product inspironG3 = new Product();
            inspironG3.setName("Inspiron G3");
            inspironG3.setBasket(null);
            inspironG3.setValue(new BigDecimal(4099));
            inspironG3.setImage("inspironG3_Dell_4099.jpg");
            inspironG3.setInStock(true);
            inspironG3.setDescription("Dell Inspiron G3 i5-10300H/16GB/512/Ubuntu GTX1650Ti");
            inspironG3.setBrand("Dell");
            inspironG3.setCategory(ProductCategory.LAPTOP);
            inspironG3.setTransaction(null);
            productRepository.save(inspironG3);

            Product macbookAir = new Product();
            macbookAir.setName("Macbook Air");
            macbookAir.setBasket(null);
            macbookAir.setValue(new BigDecimal(4699));
            macbookAir.setImage("macbookAir_Apple_4699.jpg");
            macbookAir.setInStock(true);
            macbookAir.setDescription("Apple MacBook Air M1/8GB/512/Mac OS Gold");
            macbookAir.setBrand("Apple");
            macbookAir.setCategory(ProductCategory.LAPTOP);
            macbookAir.setTransaction(null);
            productRepository.save(macbookAir);

            Product ideaPad315 = new Product();
            ideaPad315.setName("IdeaPad 3-15");
            ideaPad315.setBasket(null);
            ideaPad315.setValue(new BigDecimal(2849));
            ideaPad315.setImage("ideaPad315_Lenovo_2849.jpg");
            ideaPad315.setInStock(true);
            ideaPad315.setDescription("Lenovo IdeaPad 3-15 Ryzen 5/20GB/480");
            ideaPad315.setBrand("Lenovo");
            ideaPad315.setCategory(ProductCategory.LAPTOP);
            ideaPad315.setTransaction(null);
            productRepository.save(ideaPad315);

            Product swift3 = new Product();
            swift3.setName("Swift 3");
            swift3.setBasket(null);
            swift3.setValue(new BigDecimal(3499));
            swift3.setImage("swift3_Acer_3499.jpg");
            swift3.setInStock(true);
            swift3.setDescription("Acer Swift 3 R3-5300U/8GB/256 Niebieski");
            swift3.setBrand("Acer");
            swift3.setCategory(ProductCategory.LAPTOP);
            swift3.setTransaction(null);
            productRepository.save(swift3);

            Product aspire3 = new Product();
            aspire3.setName("Aspire 3");
            aspire3.setBasket(null);
            aspire3.setValue(new BigDecimal(3499));
            aspire3.setImage("aspire3_Acer_3499.jpg");
            aspire3.setInStock(true);
            aspire3.setDescription("Acer Aspire 3 i3-1115G4/4GB/256 Srebrny");
            aspire3.setBrand("Acer");
            aspire3.setCategory(ProductCategory.LAPTOP);
            aspire3.setTransaction(null);
            productRepository.save(aspire3);

            Product vostro3500 = new Product();
            vostro3500.setName("Vostro 3500");
            vostro3500.setBasket(null);
            vostro3500.setValue(new BigDecimal(3399));
            vostro3500.setImage("vostro3500_Dell_3399.jpg");
            vostro3500.setInStock(true);
            vostro3500.setDescription("Dell Vostro 3500 i5-1135G7/16GB/512/Win10P");
            vostro3500.setBrand("Dell");
            vostro3500.setCategory(ProductCategory.LAPTOP);
            vostro3500.setTransaction(null);
            productRepository.save(vostro3500);

            Product xps17 = new Product();
            xps17.setName("Xps 17");
            xps17.setBasket(null);
            xps17.setValue(new BigDecimal(20999));
            xps17.setImage("xps17_Dell_20999.jpg");
            xps17.setInStock(true);
            xps17.setDescription("Dell XPS 17 9710 i9-11980HK/64GB/2TB/Win10 RTX3060");
            xps17.setBrand("Dell");
            xps17.setCategory(ProductCategory.LAPTOP);
            xps17.setTransaction(null);
            productRepository.save(xps17);

            Product beyerDynamicT5v3 = new Product();
            beyerDynamicT5v3.setName("BeyerDynamic T5 v3");
            beyerDynamicT5v3.setBasket(null);
            beyerDynamicT5v3.setValue(new BigDecimal(3999));
            beyerDynamicT5v3.setImage("beyerDynamicT5v3_beyerdynamic_3999.jpg");
            beyerDynamicT5v3.setInStock(true);
            beyerDynamicT5v3.setDescription("Beyerdynamic T5 v3");
            beyerDynamicT5v3.setBrand("Beyerdynamic");
            beyerDynamicT5v3.setCategory(ProductCategory.HEADSET);
            beyerDynamicT5v3.setTransaction(null);
            productRepository.save(beyerDynamicT5v3);

            Product bangOlufsen = new Product();
            bangOlufsen.setName("Bang & Olufsen");
            bangOlufsen.setBasket(null);
            bangOlufsen.setValue(new BigDecimal(2299));
            bangOlufsen.setImage("bang&olufsen_bang&olufsen_2299.jpg");
            bangOlufsen.setInStock(true);
            bangOlufsen.setDescription("Bang & Olufsen BEOPLAY Portal Black Anthracite");
            bangOlufsen.setBrand("Bang & Olufsen");
            bangOlufsen.setCategory(ProductCategory.HEADSET);
            bangOlufsen.setTransaction(null);
            productRepository.save(bangOlufsen);

            Product shuresrh1840 = new Product();
            shuresrh1840.setName("Shure SRH 1840");
            shuresrh1840.setBasket(null);
            shuresrh1840.setValue(new BigDecimal(2299));
            shuresrh1840.setImage("shuresrh1840_shure_2299.jpg");
            shuresrh1840.setInStock(true);
            shuresrh1840.setDescription("Shure SRH1840");
            shuresrh1840.setBrand("Shure");
            shuresrh1840.setCategory(ProductCategory.HEADSET);
            shuresrh1840.setTransaction(null);
            productRepository.save(shuresrh1840);

            Product shureAonic5 = new Product();
            shureAonic5.setName("Shure Aonic 5");
            shureAonic5.setBasket(null);
            shureAonic5.setValue(new BigDecimal(2199));
            shureAonic5.setImage("shureAonic5_shure_2199.jpg");
            shureAonic5.setInStock(true);
            shureAonic5.setDescription("Shure Aonic 5 przezroczyste");
            shureAonic5.setBrand("Shure");
            shureAonic5.setCategory(ProductCategory.HEADSET);
            shureAonic5.setTransaction(null);
            productRepository.save(shureAonic5);

            Product denon5200 = new Product();
            denon5200.setName("Denon AH-D5200");
            denon5200.setBasket(null);
            denon5200.setValue(new BigDecimal(2199));
            denon5200.setImage("denonahd5200_denon_2199.jpg");
            denon5200.setInStock(true);
            denon5200.setDescription("Denon AH-D5200");
            denon5200.setBrand("Denon");
            denon5200.setCategory(ProductCategory.HEADSET);
            denon5200.setTransaction(null);
            productRepository.save(denon5200);

            Product appleAirPods = new Product();
            appleAirPods.setName("Apple Air Pods Max");
            appleAirPods.setBasket(null);
            appleAirPods.setValue(new BigDecimal(2149));
            appleAirPods.setImage("appleAirPodsMax_apple_2149.jpg");
            appleAirPods.setInStock(true);
            appleAirPods.setDescription("Apple AirPods Max różowe");
            appleAirPods.setBrand("Apple");
            appleAirPods.setCategory(ProductCategory.HEADSET);
            appleAirPods.setTransaction(null);
            productRepository.save(appleAirPods);

            Product beyerDynamicDT1770 = new Product();
            beyerDynamicDT1770.setName("Beyerdynamic DT 1770 Pro");
            beyerDynamicDT1770.setBasket(null);
            beyerDynamicDT1770.setValue(new BigDecimal(1899));
            beyerDynamicDT1770.setImage("beyerDynamicDT1770_beyerdynamic_1899.jpg");
            beyerDynamicDT1770.setInStock(true);
            beyerDynamicDT1770.setDescription("Beyerdynamic DT 1770 Pro");
            beyerDynamicDT1770.setBrand("Beyerdynamic");
            beyerDynamicDT1770.setCategory(ProductCategory.HEADSET);
            beyerDynamicDT1770.setTransaction(null);
            productRepository.save(beyerDynamicDT1770);

            Product sennheiserHD660S = new Product();
            sennheiserHD660S.setName("Sennheiser HD 660 S");
            sennheiserHD660S.setBasket(null);
            sennheiserHD660S.setValue(new BigDecimal(1819));
            sennheiserHD660S.setImage("sennheiserHD660S_sennheiser_1819.jpg");
            sennheiserHD660S.setInStock(true);
            sennheiserHD660S.setDescription("Sennheiser HD 660S");
            sennheiserHD660S.setBrand("Sennheiser");
            sennheiserHD660S.setCategory(ProductCategory.HEADSET);
            sennheiserHD660S.setTransaction(null);
            productRepository.save(sennheiserHD660S);

            Product philipsFidelioL3 = new Product();
            philipsFidelioL3.setName("Philips Fidelio L3");
            philipsFidelioL3.setBasket(null);
            philipsFidelioL3.setValue(new BigDecimal(1499));
            philipsFidelioL3.setImage("philipsFidelioL3_philips_1499.jpg");
            philipsFidelioL3.setInStock(true);
            philipsFidelioL3.setDescription("Philips Fidelio L3");
            philipsFidelioL3.setBrand("Philips");
            philipsFidelioL3.setCategory(ProductCategory.HEADSET);
            philipsFidelioL3.setTransaction(null);
            productRepository.save(philipsFidelioL3);

            Product sennheiserEPOS = new Product();
            sennheiserEPOS.setName("Sennheiser EPOS GSP 670");
            sennheiserEPOS.setBasket(null);
            sennheiserEPOS.setValue(new BigDecimal(1499));
            sennheiserEPOS.setImage("sennheiserEPOS_sennheiser_1499.jpg");
            sennheiserEPOS.setInStock(true);
            sennheiserEPOS.setDescription("Sennheiser EPOS GSP 670");
            sennheiserEPOS.setBrand("Sennheiser");
            sennheiserEPOS.setCategory(ProductCategory.HEADSET);
            sennheiserEPOS.setTransaction(null);
            productRepository.save(sennheiserEPOS);

            Product sennheiserMomentum = new Product();
            sennheiserMomentum.setName("Sennheiser Momentum Wireless M3");
            sennheiserMomentum.setBasket(null);
            sennheiserMomentum.setValue(new BigDecimal(1499));
            sennheiserMomentum.setImage("sennheiserMomentum_sennheiser_1499.jpg");
            sennheiserMomentum.setInStock(true);
            sennheiserMomentum.setDescription("Sennheiser Momentum Wireless M3 AEBT XL Biały");
            sennheiserMomentum.setBrand("Sennheiser");
            sennheiserMomentum.setCategory(ProductCategory.HEADSET);
            sennheiserMomentum.setTransaction(null);
            productRepository.save(sennheiserMomentum);

            Product asusChakram = new Product();
            asusChakram.setName("Asus Chakram");
            asusChakram.setBasket(null);
            asusChakram.setValue(new BigDecimal(799));
            asusChakram.setImage("asusChakram_asus_799.jpg");
            asusChakram.setInStock(true);
            asusChakram.setDescription("ASUS ROG Chakram");
            asusChakram.setBrand("Asus");
            asusChakram.setCategory(ProductCategory.MOUSE);
            asusChakram.setTransaction(null);
            productRepository.save(asusChakram);

            Product razerViper = new Product();
            razerViper.setName("Razer Viper Ultimate");
            razerViper.setBasket(null);
            razerViper.setValue(new BigDecimal(699));
            razerViper.setImage("razerViper_razer_699.jpg");
            razerViper.setInStock(true);
            razerViper.setDescription("Razer Viper Ultimate & Mouse Dock Quartz");
            razerViper.setBrand("Razer");
            razerViper.setCategory(ProductCategory.MOUSE);
            razerViper.setTransaction(null);
            productRepository.save(razerViper);

            Product razerNaga = new Product();
            razerNaga.setName("Razer Naga Pro");
            razerNaga.setBasket(null);
            razerNaga.setValue(new BigDecimal(609));
            razerNaga.setImage("razerNaga_razer_609.jpg");
            razerNaga.setInStock(true);
            razerNaga.setDescription("Razer Naga Pro");
            razerNaga.setBrand("Razer");
            razerNaga.setCategory(ProductCategory.MOUSE);
            razerNaga.setTransaction(null);
            productRepository.save(razerNaga);

            Product logitechPro = new Product();
            logitechPro.setName("Logitech Pro X Superlight");
            logitechPro.setBasket(null);
            logitechPro.setValue(new BigDecimal(579));
            logitechPro.setImage("logitechPro_logitech_579.jpg");
            logitechPro.setInStock(true);
            logitechPro.setDescription("Logitech PRO X SUPERLIGHT Czarny");
            logitechPro.setBrand("Logitech");
            logitechPro.setCategory(ProductCategory.MOUSE);
            logitechPro.setTransaction(null);
            productRepository.save(logitechPro);

            Product roccatKone = new Product();
            roccatKone.setName("Roccat Kone Pro Air");
            roccatKone.setBasket(null);
            roccatKone.setValue(new BigDecimal(559));
            roccatKone.setImage("roccatKone_roccat_559.jpg");
            roccatKone.setInStock(true);
            roccatKone.setDescription("Roccat Kone Pro Air (biała)");
            roccatKone.setBrand("Roccat");
            roccatKone.setCategory(ProductCategory.MOUSE);
            roccatKone.setTransaction(null);
            productRepository.save(roccatKone);

            Product razerDeathAdder = new Product();
            razerDeathAdder.setName("Razer DeathAdder V2 PRO");
            razerDeathAdder.setBasket(null);
            razerDeathAdder.setValue(new BigDecimal(559));
            razerDeathAdder.setImage("razerDeathAdder_razer_559.jpg");
            razerDeathAdder.setInStock(true);
            razerDeathAdder.setDescription("Razer DeathAdder V2 Pro");
            razerDeathAdder.setBrand("Razer");
            razerDeathAdder.setCategory(ProductCategory.MOUSE);
            razerDeathAdder.setTransaction(null);
            productRepository.save(razerDeathAdder);

            Product huaweiWireless = new Product();
            huaweiWireless.setName("Huawei Wireless Mouse GT");
            huaweiWireless.setBasket(null);
            huaweiWireless.setValue(new BigDecimal(499));
            huaweiWireless.setImage("huaweiWireless_huawei_499.jpg");
            huaweiWireless.setInStock(true);
            huaweiWireless.setDescription("Huawei Wireless Mouse GT");
            huaweiWireless.setBrand("Huawei");
            huaweiWireless.setCategory(ProductCategory.MOUSE);
            huaweiWireless.setTransaction(null);
            productRepository.save(huaweiWireless);

            Product steelSeriesPrime = new Product();
            steelSeriesPrime.setName("SteelSeries Prime Wireless");
            steelSeriesPrime.setBasket(null);
            steelSeriesPrime.setValue(new BigDecimal(499));
            steelSeriesPrime.setImage("steelseriesPrime_steelseries_499.jpg");
            steelSeriesPrime.setInStock(true);
            steelSeriesPrime.setDescription("SteelSeries Prime Wireless");
            steelSeriesPrime.setBrand("Steelseries");
            steelSeriesPrime.setCategory(ProductCategory.MOUSE);
            steelSeriesPrime.setTransaction(null);
            productRepository.save(steelSeriesPrime);

            Product steelseriesRival710 = new Product();
            steelseriesRival710.setName("Steelseries Rival 710");
            steelseriesRival710.setBasket(null);
            steelseriesRival710.setValue(new BigDecimal(439));
            steelseriesRival710.setImage("steelseriesRival710_steelseries_439.jpg");
            steelseriesRival710.setInStock(true);
            steelseriesRival710.setDescription("SteelSeries Rival 710");
            steelseriesRival710.setBrand("Steelseries");
            steelseriesRival710.setCategory(ProductCategory.MOUSE);
            steelseriesRival710.setTransaction(null);
            productRepository.save(steelseriesRival710);

            Product appleMagicMouse = new Product();
            appleMagicMouse.setName("Apple Magic Mouse");
            appleMagicMouse.setBasket(null);
            appleMagicMouse.setValue(new BigDecimal(399));
            appleMagicMouse.setImage("appleMagicMouse_apple_399.jpg");
            appleMagicMouse.setInStock(true);
            appleMagicMouse.setDescription("Apple Magic Mouse");
            appleMagicMouse.setBrand("Apple");
            appleMagicMouse.setCategory(ProductCategory.MOUSE);
            appleMagicMouse.setTransaction(null);
            productRepository.save(appleAirPods);

            Product asusClaymore2 = new Product();
            asusClaymore2.setName("Asus Claymore II");
            asusClaymore2.setBasket(null);
            asusClaymore2.setValue(new BigDecimal(1499));
            asusClaymore2.setImage("asusClaymore2_asus_1499.jpg");
            asusClaymore2.setInStock(true);
            asusClaymore2.setDescription("ASUS ROG Claymore II");
            asusClaymore2.setBrand("Asus");
            asusClaymore2.setCategory(ProductCategory.KEYBOARD);
            asusClaymore2.setTransaction(null);
            productRepository.save(asusClaymore2);

            Product razerHuntsman = new Product();
            razerHuntsman.setName("Razer Huntsman v2 Analog");
            razerHuntsman.setBasket(null);
            razerHuntsman.setValue(new BigDecimal(1229));
            razerHuntsman.setImage("razerHuntsman_razer_1229.jpg");
            razerHuntsman.setInStock(true);
            razerHuntsman.setDescription("Razer Huntsman V2 Analog");
            razerHuntsman.setBrand("Razer");
            razerHuntsman.setCategory(ProductCategory.KEYBOARD);
            razerHuntsman.setTransaction(null);
            productRepository.save(razerHuntsman);

            Product steelseriesApex = new Product();
            steelseriesApex.setName("Steelseries Apex PRO TKL");
            steelseriesApex.setBasket(null);
            steelseriesApex.setValue(new BigDecimal(999));
            steelseriesApex.setImage("steelseriesApex_steelseries_999.jpg");
            steelseriesApex.setInStock(true);
            steelseriesApex.setDescription("SteelSeries Apex PRO TKL OmniPoint");
            steelseriesApex.setBrand("Steelseries");
            steelseriesApex.setCategory(ProductCategory.KEYBOARD);
            steelseriesApex.setTransaction(null);
            productRepository.save(steelseriesApex);

            Product corsairK95 = new Product();
            corsairK95.setName("Corsair K95");
            corsairK95.setBasket(null);
            corsairK95.setValue(new BigDecimal(939));
            corsairK95.setImage("corsairK95_corsair_939.jpg");
            corsairK95.setInStock(true);
            corsairK95.setDescription("Corsair K95 RGB PLATINUM XT Speed");
            corsairK95.setBrand("Corsair");
            corsairK95.setCategory(ProductCategory.KEYBOARD);
            corsairK95.setTransaction(null);
            productRepository.save(corsairK95);

            Product appleMagicKeyboard = new Product();
            appleMagicKeyboard.setName("Apple Magic Keyboard");
            appleMagicKeyboard.setBasket(null);
            appleMagicKeyboard.setValue(new BigDecimal(899));
            appleMagicKeyboard.setImage("appleMagicKeyboard_apple_899.jpg");
            appleMagicKeyboard.setInStock(true);
            appleMagicKeyboard.setDescription("Apple Magic Keyboard z Touch ID i polem numerycznym (US)");
            appleMagicKeyboard.setBrand("Apple");
            appleMagicKeyboard.setCategory(ProductCategory.KEYBOARD);
            appleMagicKeyboard.setTransaction(null);
            productRepository.save(appleMagicKeyboard);

            Product razerBlackWidowV3 = new Product();
            razerBlackWidowV3.setName("Razer BlackWidow V3");
            razerBlackWidowV3.setBasket(null);
            razerBlackWidowV3.setValue(new BigDecimal(899));
            razerBlackWidowV3.setImage("razerBlackWidowV3_razer_899.jpg");
            razerBlackWidowV3.setInStock(true);
            razerBlackWidowV3.setDescription("Razer BlackWidow V3 Pro Yellow Switch");
            razerBlackWidowV3.setBrand("Razer");
            razerBlackWidowV3.setCategory(ProductCategory.KEYBOARD);
            razerBlackWidowV3.setTransaction(null);
            productRepository.save(razerBlackWidowV3);

            Product roccatVulcan = new Product();
            roccatVulcan.setName("Roccat Vulcan Pro");
            roccatVulcan.setBasket(null);
            roccatVulcan.setValue(new BigDecimal(899));
            roccatVulcan.setImage("roccatVulcan_roccat_899.jpg");
            roccatVulcan.setInStock(true);
            roccatVulcan.setDescription("Roccat Vulcan Pro");
            roccatVulcan.setBrand("Roccat");
            roccatVulcan.setCategory(ProductCategory.KEYBOARD);
            roccatVulcan.setTransaction(null);
            productRepository.save(roccatVulcan);

            Product logitechG915 = new Product();
            logitechG915.setName("Logitech G915 LIGHSPEED");
            logitechG915.setBasket(null);
            logitechG915.setValue(new BigDecimal(899));
            logitechG915.setImage("logitechG915_logitech_899.jpg");
            logitechG915.setInStock(true);
            logitechG915.setDescription("Logitech G915 LIGHTSPEED Linear");
            logitechG915.setBrand("Logitech");
            logitechG915.setCategory(ProductCategory.KEYBOARD);
            logitechG915.setTransaction(null);
            productRepository.save(logitechG915);

            Product logitechCraft = new Product();
            logitechCraft.setName("Logitech Craft");
            logitechCraft.setBasket(null);
            logitechCraft.setValue(new BigDecimal(749));
            logitechCraft.setImage("logitechCraft_logitech_749.jpg");
            logitechCraft.setInStock(true);
            logitechCraft.setDescription("Logitech Craft");
            logitechCraft.setBrand("Logitech");
            logitechCraft.setCategory(ProductCategory.KEYBOARD);
            logitechCraft.setTransaction(null);
            productRepository.save(logitechCraft);

            Product dellAlienware = new Product();
            dellAlienware.setName("Dell Alienware AW510K");
            dellAlienware.setBasket(null);
            dellAlienware.setValue(new BigDecimal(699));
            dellAlienware.setImage("dellAlienware_dell_699.jpg");
            dellAlienware.setInStock(true);
            dellAlienware.setDescription("Dell Alienware AW510K (Lunar Light)");
            dellAlienware.setBrand("Dell");
            dellAlienware.setCategory(ProductCategory.KEYBOARD);
            dellAlienware.setTransaction(null);
            productRepository.save(dellAlienware);
        };
    }




}



















