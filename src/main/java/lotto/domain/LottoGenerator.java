package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LottoGenerator {

    private static final int LOTTO_PRICE = 1_000;
    private static final int LOTTO_NUMBER_LOWER_LIMIT = 1;
    private static final int LOTTO_NUMBER_UPPER_LIMIT = 45;
    private static final int LOTTO_NUMBER_QUANTITY = 6;
    private static final int ZERO = 0;
    private static final String MONEY_SHOULD_BE_DIVIDED_BY_ONE_THOUSAND = "[ERROR] 구입 금액은 1,000원 단위로만 받을 수 있습니다.";

    private final List<Lotto> lottos = new ArrayList<>();
    private final int lottoQuantity;

    public int getLottoQuantity() {
        return lottoQuantity;
    }

    public LottoGenerator(int money){

        lottoQuantity = money/LOTTO_PRICE;
    }

    public List<Lotto> generateLottos(){
        for(int i=0;i<lottoQuantity;i++){
            Lotto lotto = generateLotto();
            lottos.add(lotto);
        }

        return lottos;
    }

    private Lotto generateLotto() {
        List<Integer> randomNumbers = new ArrayList<>(
                Randoms.pickUniqueNumbersInRange(1,45, LOTTO_NUMBER_QUANTITY));
        randomNumbers.sort(Comparator.naturalOrder());


        return new Lotto(randomNumbers);

    }




}
