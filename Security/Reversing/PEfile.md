# PE file

## Portable Executable
: 옮겨다니면서 실행시킬 수 있는 파일, Windows 상에서 실행할 수 있는 프로그램.

실행 - EXE, SCR
<br>드라이버 - SYS,VXD
<br>라이브러리 - DLL, OCX, CPL, DRV
<br>오브젝트 - OBJ

# 실행파일을 실행하기 위한 도구,Hex Editor
### [HxD](https://mh-nexus.de/en/downloads.php)
: HxD is a carefully designed and fast hex editor which, additionally to raw disk editing and modifying of main memory (RAM), handles files of any size.

<img width="738" alt="스크린샷 2019-07-23 오후 4 10 57" src="https://user-images.githubusercontent.com/43804152/61690524-7bfca300-ad64-11e9-87b5-4ba1dcd16a2f.png">

#### PE 헤더의 내용 <br> 파일이 실행되기 위해 필요한 모든 정보
* 메모리에 어떻게 적재되는가
* 어디서부터 실행해야 하는가
* 실행에 필요한 DLL은 무엇인가
* 필요한 스택/힙 메모리의 크기은 어느 정도인가 등

1. 파일의 내용 = 보통코드 | 데이터 | 리소스로 나뉘어 저장
2. 섹션 헤더에 각 섹션에 대한 파일/메모리에서의 크기, 위치, 속성 등이 정의
3. NULL은 처리효율을 높이기 위함.

#### RVA + ImageBase = VA
* VA(Virutal Address) : 프로세스 가상 메모리의 절대주소
* RVA(Relative Virtual Address): 기준위치에서부터의 상대주소 

      * PE 헤더 내 정보는 RVA형태가 많다
      PE파일이 프로세스 가상 메모리의 특정 위치에 로딩되는 순간 이미 그 위치에 다른 PE파일이 로딩되어 있을 수 있기 때문이다.
      재배치 과정을 통해 비어있는 다른 위치에 로딩 되어야 하는데 PE헤더 정보들이 VA로 되어 있을 경우 정상적인 액세스가 이루어지지 않는다.
      
      * RVA는 기준위치에 대한 상대주소가 변하지 않기 때문에 정보 액세스가 가능하다.

![340px-Portable_Executable_32_bit_Structure_in_SVG svg](https://user-images.githubusercontent.com/43804152/61536481-b79b2280-aa6f-11e9-9737-83032ac8094a.png)
