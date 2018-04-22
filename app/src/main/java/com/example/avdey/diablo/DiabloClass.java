package com.example.avdey.diablo;

public class DiabloClass {
    private String name;
    private String description;
    private int id;


    public static final DiabloClass[] diabloClass = {
            new DiabloClass("Crusader", "Crusader Crest. Resourceful and resilient, Crusaders are an entirely different breed of holy warriors, trained to wield sacred powers unlike any before. Unbending champions of faith and law, Crusaders' formidable skills and abilities set them apart on the battlefield, wading through scores of foes and leaving demonic bodies", R.drawable.crusader),
            new DiabloClass("Wizard", "Cookie Disclaimer. Blizzard Entertainment uses cookies and similar technologies on its websites. By continuing your browsing after being presented with the cookie information you consent to such use. This website uses cookies. By further browsing you consent to such use. OK Learn More · Diablo III · Forums Wizard ", R.drawable.wizard),
    new DiabloClass("Demon Hanter","Охотник на демонов пребывает в состоянии постоянной войны с самим собой. Он не надеется вернуться к своей прежней жизни, но продолжает выслеживать демонов и уничтожать их. Это для него — дело чести. Охотники, которые обучают себе подобных, становятся осмотрительными и осторожными",R.drawable.demonhanter)
    };

    public DiabloClass(String name, String description, int id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name;

    }
}
