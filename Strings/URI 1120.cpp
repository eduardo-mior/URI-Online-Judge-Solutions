#include <iostream>
#include <string>

using namespace std;

string verify(string str){
    int tam = str.length()-1, i=0;
    string string1;
    if(str[0] != '0') return str;
    else{
        while(str[i] == '0')i++;
        while(i<=tam)string1+=str[i++];
        return string1;
    }
}
int main() {
 
    int numbDef;
    string num, fim;

  while(1){
    cin >> numbDef;
    cin >> num;
    int tam = num.length()-1;
    string aux = verify(num);
    if(numbDef==0 && aux[0]=='\0')break;
    for(int i=0;i<aux.length();i++) {
      if(aux[i]!=numbDef+'0') fim+=aux[i];
      fim=verify(fim);
    }
    
    (fim=="\0")? cout << 0 <<endl : cout<< fim <<endl;
    fim.clear();
  }
  
    return 0;
}