import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {

    public int solution(int[] citations) {
        int answer = 0;


//        공식적으로 f 가 각 출판물에 대한 인용 횟수에 해당하는 함수이면 다음과 같이 h 인덱스를 계산합니다 .
//        먼저 f 값을 가장 큰 값에서 가장 낮은 값으로 정렬합니다 .
//        그런 다음 f 가 위치 보다 크거나 같은 마지막 위치를 찾습니다 ( 이 위치를 h 라고 부릅니다 ).
//        예를 들어, 각각 10, 8, 5, 4 및 3 개의 인용이있는 5 개의 간행물 A, B, C, D 및 E를 보유한 연구원이있는 경우 h-index는 4 번째 출판물에 4 개의 인용이 있고 5 번째에는 3 개의 인용이 있기 때문에 4와 같습니다.
//        반대로 동일한 출판물에 25, 8, 5, 3, 3 개의 인용이있는 경우 색인은 3입니다 (즉, 3 번째 위치 ) 네 번째 논문에는 인용 횟수가 3 회 밖에 없기 때문입니다.

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {

            int h_index = citations.length - i;

            if (citations[i] >= h_index) {
                answer = h_index;
                break;
            }
        }
        return answer;

    }
}
