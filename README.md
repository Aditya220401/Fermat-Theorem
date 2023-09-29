# Fermat-Theorem
Uploaded files:
Java file
.jar file


1. User input for the K value, if user will give input less than 10 then it will ask user to give the input again for k.
2. User input for the n value, if user will give input less than 3 and greater than 11, it will ask user to give input again for n.
3. Applied nested for loop to compute all the combinations of x and y.
   3.1 x^n + y^n is calculated
   3.2 Value for z is computed
   3.3 Near miss calculated with respect to z and z+1, ((x^n + y^n)-z^n) ((z+1)^n-(x^n + y^n)), which ever will be less that will count as near miss
   3.4 Next Relative miss is calculated
   3.5 Next Smallest Miss is found out. in every iteration whenever Relative Miss will be less it will be called Smallest Miss
