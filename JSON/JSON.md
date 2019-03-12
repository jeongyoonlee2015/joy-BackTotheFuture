# JSON
> Java Script Object Notation의 약자로 Javascript에서 객체를 만들 때 사용하는 표현식을 의미한다.
이 표현식은 사람과 기계가 이해하기 쉬우면서 데이터의 용량이 작다.
이런 이유로 최근에는 JSON이 XML을 대체해서 설정의 저장이나 데이터 전송 등에 많이 사용된다.

* json.parse()
* json.stringify()

## JSON의 이용
> 서버-클라이언트 애플리케이션 사이 작업에서 유용하고 광범위하게 사용하는 기술이다.

<Ajax와 JSON>
JSON의 진가는 서버와 통신을 할 때 드러난다.

> 1st Lecture
서버쪽에는 타임라인의 리스트를 콤마로 구분해서 전달한다.

* 서버쪽에서 배열의 데이터를 클라이언트로 전송해줄 때
배열로 바로 보낼 수 없어서 문자로 만들어서 원소와 원소를 분류해서 보내주고
클라이언트 쪽에서는 받은 데이터를 배열로 정리한다.



- Php

   echo implode(‘,’, $timezones);

- JavaScript

   var tzs = _tzs.split(‘,’);

-> 다차원 배열이거나 복잡한 객체 형식의 데이터라면
굉장히 복잡해진다.
