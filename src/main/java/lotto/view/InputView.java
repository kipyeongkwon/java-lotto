package lotto.view;


import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private static final String PURCHASE_CHARGE_MESSAGE = "구입금액을 입력해 주세요";
    private static final String LOTTO_NUMBERS_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final String BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";
    private static final String NOT_NUMBER = "[ERROR] 숫자가 아닌 값이 입력되었습니다.";


    public static int getPerchaseCharge(){
        System.out.println(PURCHASE_CHARGE_MESSAGE);
        try{
            return Integer.parseInt(Console.readLine());
        }
        catch (NumberFormatException e){
            throw new IllegalArgumentException(NOT_NUMBER);
        }
    }

    public static List<Integer> getLottoNumber(){
        System.out.println(LOTTO_NUMBERS_MESSAGE);
        try{
            return Arrays.stream(Console.readLine().split(","))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        }
        catch (NumberFormatException e){
                throw new IllegalArgumentException(NOT_NUMBER);


        }
    }

    public static int getBonusNumber(){
        System.out.println(BONUS_NUMBER_MESSAGE);
        try{
            return Integer.parseInt(Console.readLine());
        }
        catch (NumberFormatException e){
            throw new IllegalArgumentException(NOT_NUMBER);
        }
    }




}
