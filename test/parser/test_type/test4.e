class TEST4

feature 

	a:A;
	b1:A[X];
	b2:A[X,Y,Z];
	b3:A[X,A[T,like u],Z];

feature

	c:like toto;
	d:like x.y;

feature

	f0:A;
	ef1:expanded A;
	e2:expanded A[X];
	e3:expanded A[X,Y,Z];
	e4:expanded A[X,A[T,like u],Z];

end