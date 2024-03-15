package lotto.domain;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender;

import java.util.*;

public class Lotto {
    private final List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (!SizeCheck(numbers) || !isDuplicate(numbers)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean SizeCheck(List<Integer> numbers ){
        return numbers.size() == 6;
    }  //사이즈가 6인지 체크
    private boolean isDuplicate(List<Integer> numbers){
        Set<Integer> duplicateCheck = new HashSet<>(numbers);
        return duplicateCheck.size() ==6;
    }  //중복여부 검사 hash set의 중복원소가 없는 성질을 이용해 사이즈로 중복여부 확인




    // TODO: 추가 기능 구현
}
