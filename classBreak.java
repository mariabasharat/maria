// using break with nested loops.
ClassBreak3{
public static void main (string args [] )
for (int i=0; i<3; i++){
system.out,println(outer loop count : " + i );
system.out.println("     inner loop count:  ");
int t = 0;
while(t < 100){
if (t ==10) break;
system.out.println(t + " ");
t++;
}
system.out.println();
}
system.out.println("loops complete.");
}
}
