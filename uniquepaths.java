class solution{
public:
int solve(int i,int j,int m,int n){
if(i==m-1 && j==n-1){
return 1;
}
if(i>=m || j>=n){
return 0;
}
else{
return solve(i+1,j,m,n) + solve(i,j+1,m,n);
}
}
int uniquepaths(int m,int n){
return solve(0,0,m,n);
}
};
