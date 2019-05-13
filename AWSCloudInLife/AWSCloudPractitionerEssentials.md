## Intro
* AWS Cloud
* Cloud Computing
  * 인터넷을 통해 IT리소스와 애플리케이션을 On Demand로 제공하는 서비스를 말한다.
  * 요금은 사용한 만큼만 청구된다.
* Cloud = Public Goods

* Datat Center
* [Region](https://docs.aws.amazon.com/ko_kr/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions-availability-zones)
  * AZ(Available Zone)
     * 말 그대로 가용영역.
     * 서비스를 만들면 서로 다른 AZ에 두 개 이상 둘 것.
     
  * Start Service
    * VPC - name , IP Scope
    * Subnet - VPC split , IP Scope
      * Subnet 보통 2개 이상 (Public / Private) 
    * IGW(Internet Gateway) - name
    
    
  1) Region에 VPC 생성
  2) IGW 생성
  3) public Subnet 1개 생성
  4) Private Subnet 1개 생성
    
