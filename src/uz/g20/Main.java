package uz.g20;

import uz.g20.clinet.ui.UserUI;
import uz.g20.server.database.Database;
import uz.g20.server.model.Question;
import uz.g20.server.model.UzbWords;

public class Main {
        static {

        Question question1  = new Question("1","afraid");
        Question question2 = new Question("1","agree");
        Question question3 = new Question("1","angry");
        Question question4 = new Question("1","arrive");
        Question question5 = new Question("1","attack");
        Question question6 = new Question("1","bottom");
        Question question7 = new Question("1","clever");
        Question question8 = new Question("1","cruel");
        Question question9 = new Question("1","finally");
        Question question10 = new Question("1","hide");
        Question question11 = new Question("1","hunt");
        Question question12 = new Question("1","lot");
        Question question13 = new Question("1","middle");
        Question question14 = new Question("1","moment");
        Question question15 = new Question("1","pleased");
        Question question16 = new Question("1","promise");
        Question question17 = new Question("1","reply");
        Question question18 = new Question("1","safe");
        Question question19 = new Question("1","trick");
        Question question20 = new Question("1","well");




            Question question2_1 = new Question("2","adventure");
            Question question2_2 = new Question("2","approach");
            Question question2_3 = new Question("2","carefully");
            Question question2_4 = new Question("2","chemical");
            Question question2_5 = new Question("2","create");
            Question question2_6 = new Question("2","evil");
            Question question2_7 = new Question("2","experiment");
            Question question2_8 = new Question("2","kill");
            Question question2_9 = new Question("2","labaratory");
            Question question2_10 = new Question("2","laugh");
            Question question2_11 = new Question("2","loud");
            Question question2_12 = new Question("2","nervous");
            Question question2_13 = new Question("2","noisem");
            Question question2_14 = new Question("2","project");
            Question question2_15 = new Question("2","scare");
            Question question2_16 = new Question("2","secret");
            Question question2_17 = new Question("2","shout");
            Question question2_18 = new Question("2","smell");
            Question question2_19 = new Question("2","terrible");
            Question question2_20 = new Question("2","worse");

            Question question1_3  = new Question("3","alien");
            Question question2__3 = new Question("3","among");
            Question question3_3 = new Question("3","chart");
            Question question4_3 = new Question("3","cloud");
            Question question5_3 = new Question("3","comprehend");
            Question question6_3 = new Question("3","describe");
            Question question7_3 = new Question("3","ever");
            Question question8_3 = new Question("3","fail");
            Question question9_3 = new Question("3","friendly");
            Question question10_3 = new Question("3","grade");
            Question question11_3 = new Question("3","instead");
            Question question12_3 = new Question("3","library");
            Question question13_3 = new Question("3","planet");
            Question question14_3 = new Question("3","several");
            Question question15_3 = new Question("3","solve");
            Question question16_3 = new Question("3","suddenly");
            Question question17_3 = new Question("3","suppose");
            Question question18_3 = new Question("3","universe");
            Question question19_3 = new Question("3","view");
            Question question20_3 = new Question("3","report");

            UzbWords uzbWords1 = new UzbWords("qo'rqmoq",question1.getId());
            UzbWords uzbWords2 = new UzbWords("rozi bo'lmoq",question2.getId());
            UzbWords uzbWords3 = new UzbWords("jahli chiqmoq",question3.getId());
            UzbWords uzbWords4 = new UzbWords("yetib kelmoq",question4.getId());
            UzbWords uzbWords5 = new UzbWords("hujum qilmoq",question5.getId());
            UzbWords uzbWords6 = new UzbWords("ostida",question6.getId());
            UzbWords uzbWords7 = new UzbWords("aqilli",question7.getId());
            UzbWords uzbWords8 = new UzbWords("shavqatsiz",question8.getId());
            UzbWords uzbWords9= new UzbWords("nihoyat",question9.getId());
            UzbWords uzbWords10 = new UzbWords("yashirinmoq",question10.getId());
            UzbWords uzbWords11 = new UzbWords("ovqilmoq",question11.getId());
            UzbWords uzbWords12 = new UzbWords("ko'p",question12.getId());
            UzbWords uzbWords13 = new UzbWords("orta",question13.getId());
            UzbWords uzbWords14 = new UzbWords("shulahza",question14.getId());
            UzbWords uzbWords15 = new UzbWords("mamnun",question15.getId());
            UzbWords uzbWords16 = new UzbWords("va'da bermoq",question16.getId());
            UzbWords uzbWords17 = new UzbWords("javob bermoq",question17.getId());
            UzbWords uzbWords18 = new UzbWords("havfsiz",question18.getId());
            UzbWords uzbWords19 = new UzbWords("hiyla",question19.getId());
            UzbWords uzbWords20 = new UzbWords("yahshi",question20.getId());

            UzbWords uzbWords1_2 = new UzbWords("sarguzasht",question2_1.getId());
            UzbWords uzbWords2_2 = new UzbWords("yaqinalshmoq",question2_2.getId());
            UzbWords uzbWords3_2 = new UzbWords("ehtiyotkorlik bilan",question2_3.getId());
            UzbWords uzbWords4_2 = new UzbWords("kimyoviy",question2_4.getId());
            UzbWords uzbWords5_2 = new UzbWords("yaratmoq",question2_5.getId());
            UzbWords uzbWords6_2 = new UzbWords("yomon",question2_6.getId());
            UzbWords uzbWords7_2 = new UzbWords("tajriba",question2_7.getId());
            UzbWords uzbWords8_2 = new UzbWords("o'ldirmoq",question2_8.getId());
            UzbWords uzbWords9_2 = new UzbWords("labaratoriya",question2_9.getId());
            UzbWords uzbWords10_2 = new UzbWords("kulgi",question2_10.getId());
            UzbWords uzbWords11_2 = new UzbWords("shovqinli",question2_11.getId());
            UzbWords uzbWords12_2 = new UzbWords("havotirlanmoq",question2_12.getId());
            UzbWords uzbWords13_2 = new UzbWords("shovqin",question2_13.getId());
            UzbWords uzbWords14_2 = new UzbWords("topshiriq",question2_14.getId());
            UzbWords uzbWords15_2 =new UzbWords("qo'rqitmoq",question2_15.getId());
            UzbWords uzbWords16_2 = new UzbWords("mahfiy",question2_16.getId());
            UzbWords uzbWords17_2 = new UzbWords("baqirmoq",question2_17.getId());
            UzbWords uzbWords18_2 = new UzbWords("hidlamoq",question2_18.getId());
            UzbWords uzbWords19_2 = new UzbWords("juda yomon",question2_19.getId());
            UzbWords uzbWords20_2 = new UzbWords("yomonroq",question2_20.getId());


            UzbWords uzbWords1_3 = new UzbWords("begona",question1_3.getId());
            UzbWords uzbWords2_3 = new UzbWords("orasida",question2__3.getId());
            UzbWords uzbWords3_3 = new UzbWords("diagramma",question3_3.getId());
            UzbWords uzbWords4_3 = new UzbWords("bulut",question4_3.getId());
            UzbWords uzbWords5_3 = new UzbWords("tushunmoq",question5_3.getId());
            UzbWords uzbWords6_3 = new UzbWords("tasvirlab bermoq",question6_3.getId());
            UzbWords uzbWords7_3 = new UzbWords("ilgari",question7_3.getId());
            UzbWords uzbWords8_3 = new UzbWords("muvaffaqiyatsizlikka uchramoq",question8_3.getId());
            UzbWords uzbWords9_3= new UzbWords("do'stona",question9_3.getId());
            UzbWords uzbWords10_3 = new UzbWords("baho",question10_3.getId());
            UzbWords uzbWords11_3 = new UzbWords("o'rniga",question11_3.getId());
            UzbWords uzbWords12_3 = new UzbWords("kutubxona",question12_3.getId());
            UzbWords uzbWords13_3 = new UzbWords("sayyora",question13_3.getId());
            UzbWords uzbWords14_3 = new UzbWords("bir nechta",question14_3.getId());
            UzbWords uzbWords15_3 = new UzbWords("javob topmoq",question15_3.getId());
            UzbWords uzbWords16_3 = new UzbWords("kutilmaganda",question16_3.getId());
            UzbWords uzbWords17_3 = new UzbWords("taxmin qilmoq",question17_3.getId());
            UzbWords uzbWords18_3 = new UzbWords("koinot",question18_3.getId());
            UzbWords uzbWords19_3 = new UzbWords("qaramoq",question19_3.getId());
            UzbWords uzbWords20_3 = new UzbWords("hisobot",question20_3.getId());

            Database.ENG.add(question1);
            Database.ENG.add(question2);
            Database.ENG.add(question3);
            Database.ENG.add(question4);
            Database.ENG.add(question5);
            Database.ENG.add(question5);
            Database.ENG.add(question6);
            Database.ENG.add(question7);
            Database.ENG.add(question8);
            Database.ENG.add(question9);
            Database.ENG.add(question10);
            Database.ENG.add(question11);
            Database.ENG.add(question12);
            Database.ENG.add(question13);
            Database.ENG.add(question14);
            Database.ENG.add(question15);
            Database.ENG.add(question16);
            Database.ENG.add(question17);
            Database.ENG.add(question18);
            Database.ENG.add(question19);
            Database.ENG.add(question20);

            Database.ENG.add(question2_1);
            Database.ENG.add(question2_2);
            Database.ENG.add(question2_3);
            Database.ENG.add(question2_4);
            Database.ENG.add(question2_5);
            Database.ENG.add(question2_6);
            Database.ENG.add(question2_7);
            Database.ENG.add(question2_8);
            Database.ENG.add(question2_9);
            Database.ENG.add(question2_10);
            Database.ENG.add(question2_11);
            Database.ENG.add(question2_12);
            Database.ENG.add(question2_13);
            Database.ENG.add(question2_14);
            Database.ENG.add(question2_15);
            Database.ENG.add(question2_16);
            Database.ENG.add(question2_17);
            Database.ENG.add(question2_18);
            Database.ENG.add(question2_19);
            Database.ENG.add(question2_20);

            Database.ENG.add(question1_3);
            Database.ENG.add(question2__3);
            Database.ENG.add(question3_3);
            Database.ENG.add(question4_3);
            Database.ENG.add(question5_3);
            Database.ENG.add(question6_3);
            Database.ENG.add(question7_3);
            Database.ENG.add(question8_3);
            Database.ENG.add(question9_3);
            Database.ENG.add(question10_3);
            Database.ENG.add(question11_3);
            Database.ENG.add(question12_3);
            Database.ENG.add(question13_3);
            Database.ENG.add(question14_3);
            Database.ENG.add(question15_3);
            Database.ENG.add(question16_3);
            Database.ENG.add(question17_3);
            Database.ENG.add(question18_3);
            Database.ENG.add(question19_3);
            Database.ENG.add(question20_3);


            Database.UZB.add(uzbWords1);
            Database.UZB.add(uzbWords2);
            Database.UZB.add(uzbWords3);
            Database.UZB.add(uzbWords4);
            Database.UZB.add(uzbWords5);
            Database.UZB.add(uzbWords6);
            Database.UZB.add(uzbWords7);
            Database.UZB.add(uzbWords8);
            Database.UZB.add(uzbWords9);
            Database.UZB.add(uzbWords10);
            Database.UZB.add(uzbWords11);
            Database.UZB.add(uzbWords12);
            Database.UZB.add(uzbWords13);
            Database.UZB.add(uzbWords14);
            Database.UZB.add(uzbWords15);
            Database.UZB.add(uzbWords16);
            Database.UZB.add(uzbWords17);
            Database.UZB.add(uzbWords18);
            Database.UZB.add(uzbWords19);
            Database.UZB.add(uzbWords20);


            Database.UZB.add(uzbWords1_2);
            Database.UZB.add(uzbWords2_2);
            Database.UZB.add(uzbWords3_2);
            Database.UZB.add(uzbWords4_2);
            Database.UZB.add(uzbWords5_2);
            Database.UZB.add(uzbWords6_2);
            Database.UZB.add(uzbWords7_2);
            Database.UZB.add(uzbWords8_2);
            Database.UZB.add(uzbWords9_2);
            Database.UZB.add(uzbWords10_2);
            Database.UZB.add(uzbWords11_2);
            Database.UZB.add(uzbWords12_2);
            Database.UZB.add(uzbWords13_2);
            Database.UZB.add(uzbWords14_2);
            Database.UZB.add(uzbWords15_2);
            Database.UZB.add(uzbWords16_2);
            Database.UZB.add(uzbWords17_2);
            Database.UZB.add(uzbWords18_2);
            Database.UZB.add(uzbWords19_2);
            Database.UZB.add(uzbWords20_2);

            Database.UZB.add(uzbWords1_3);
            Database.UZB.add(uzbWords2_3);
            Database.UZB.add(uzbWords3_3);
            Database.UZB.add(uzbWords4_3);
            Database.UZB.add(uzbWords5_3);
            Database.UZB.add(uzbWords6_3);
            Database.UZB.add(uzbWords7_3);
            Database.UZB.add(uzbWords8_3);
            Database.UZB.add(uzbWords9_3);
            Database.UZB.add(uzbWords10_3);
            Database.UZB.add(uzbWords11_3);
            Database.UZB.add(uzbWords12_3);
            Database.UZB.add(uzbWords13_3);
            Database.UZB.add(uzbWords14_3);
            Database.UZB.add(uzbWords15_3);
            Database.UZB.add(uzbWords16_3);
            Database.UZB.add(uzbWords17_3);
            Database.UZB.add(uzbWords18_3);
            Database.UZB.add(uzbWords19_3);
            Database.UZB.add(uzbWords20_3);



        }
    public static void main(String[] args) {
        UserUI.runMain();
    }
}


