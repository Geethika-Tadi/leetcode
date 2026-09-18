int reverse(int x){
    int flag = 0;
    long long rev=0,temp=x;
    if(x<0){
        temp = -temp;
        flag = 1;
    }
    else{
        temp = x;
    }
    while(temp!=0){
        int rem = temp%10;
        rev = rev*10+rem;
        temp/=10;
    }
    if(rev>INT_MAX){
        return 0;
    }
    if(flag){
        return -rev;
    }
    return rev;


}