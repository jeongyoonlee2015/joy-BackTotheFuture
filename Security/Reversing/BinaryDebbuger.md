# Binary Debbuger

* 동적 분석 - [OllyDbg](http://www.ollydbg.de/)
<br>: 파일을 직접 실행시켜서 그 행위를 분석하고, 디버깅을 통하여 코드의 흐름과 메모리의 상태 등을 자세히 살펴보는 방법.

* 정적 분석 - [IDA Pro](https://hex-rays.com/products/ida/support/download.shtml)
<br>: 파일의 겉모습을 관찰하여 분석하는 방법. 파일의 확장자, 크기, 헤더정보, 실행 압축 여부, 등록 정보 등의 내용을 확인
 
* 커널 분석 - [WinDbg](https://docs.microsoft.com/ko-kr/windows-hardware/drivers/debugger/debugger-download-tools)

## OllyDbg
개발: Oleh Yuschuk
<br>이용: 바이너리 코드 분석을 위한 디버거로 소스 코드가 없을 때 유용하게 사용된다. / 리버스 엔지니어링, 크래킹에 이용
<br>기능: 레지스터 추적, 함수.API호출, Switch.Table.상수.문자열 인식, *.obj파일과 라이브러리에서 루틴의 위치를 찾아줌.
