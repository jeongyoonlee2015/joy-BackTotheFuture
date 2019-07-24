# Assembler

#### Compiler || Assembler
Compiler: 고급언어를 저급언어로 번역하는것

Assembler: 컴퓨터가 이해할 수 있는 연속적인 비트로 구성된 기계어를 사람이 알아볼 수 있도록 만든 매크로 모음

### Assembly language / Assembler language

* 기계어
    > 실제로 컴퓨터의 CPU가 읽어서 실행할 수 있는 0과 1로 이루어진 명령어의 조합.
                               
* 어셈블리어
    > 기계어에 대해 사람이 알아보기 쉬운 니모닉 기호(mnemonic symbol)를 정해 사람이 좀 더 쉽게 컴퓨터의 행동을 제어할 수 있도록 한 것.

    * 기계어와 일대일 대응이 되는 저급 언어
    * 기계어 작성을 편리하게 하기 위해 개발한 언어
    * 컴퓨터 구조에 따라 사용하는 달라진다.

* NASM x86 Hello World
  ~~~
  adosseg
  .model small
  .stack 100h
  
  .data
  hello_message db 'Hello, World!',0dh,0ah,'$'

  .code
  main proc
        mov    ax, @data
        mov    ds, ax

        mov    ah, 9
        mov    dx, offset hello_message
        int    21h

        mov    ax, 4C00h
        int    21h
  main endp
  end main
  ~~~
  
----
## REFERENCE
[PEView](http://wjradburn.com/software)

[DetectItEasy](https://tuts4you.com/download.php?view.3518)

[abex crackme](http://crackmes.de/users/abex/)

[Lena](https://tuts4you.com/download.php?list.17)

[OllyDumpEx](http://low-priority.appspot.com/ollydumpex/)

[LoadPE](https://www.softpedia.com/get/Programming/File-Editors/LordPE.shtml)
