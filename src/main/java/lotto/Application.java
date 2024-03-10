package lotto;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Application {


    public static void main(String[] args) {

        System.out.println("구입금액을 입력해 주세요");
        String stcharge = Console.readLine();
        int charge = Integer.parseInt(stcharge);
        if (charge % 1000 != 0) {
            System.out.println("[ERROR]");
            throw new IllegalArgumentException();

        }



        int cnt;
        cnt = (int) charge / 1000;
        System.out.println(cnt + "개를 구매했습니다.");


        for(int i=0;i<cnt;i++){
           List<Integer> numbers=  Randoms.pickUniqueNumbersInRange(1,45,6);
           Collections.sort(numbers);
           Lotto lotto = new Lotto(numbers);

        }




        System.out.println("당첨 번호를 입력해 주세요.");
        String Mynums = Console.readLine();
        String n[] = Mynums.split(",");
        int[] mynums = new int[7];
        for (int i = 0; i < n.length; i++) {
            mynums[i] = Integer.parseInt(n[i]);
        }


        System.out.println("보너스 번호를 입력해 주세요.");
        String bonus = Console.readLine();
        mynums[6] = Integer.parseInt(bonus);





        System.out.printf("당첨통계\n---\n");
        System.out.println("3개일치 (5,000원) - " + cnt + "개");
        System.out.println("4개일치 (50,000원) - " + cnt + "개");
        System.out.println("5개일치 (1,500,000원) - " + cnt + "개");
        System.out.println("5개일치, 보너스 볼 일치 (30,000,000원) - " + cnt + "개");
        System.out.println("6개일치 (2000,000,000원) - " + cnt + "개");
        System.out.println("총 수익률은 " + cnt + "%입니다.");


        // TODO: 프로그램 구현


    }
    }

