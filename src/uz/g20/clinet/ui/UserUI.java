package uz.g20.clinet.ui;

import uz.g20.clinet.util.ScannerUtil;

public class UserUI {
    public static void runMain() {
            while (true){
                System.out.println("1. Playing");
                System.out.println("0. log out");
                System.out.println("choose operation");
                String operation  = ScannerUtil.SCANNER_STR.nextLine();
                switch (operation){
                    case "1" -> PlayingUI.playing();
                    case "0" -> {
                        return;
                    }
                }
            }
    }
}
