-- une classe de teste
expanded class HELLO

-- hello a tous

feature 

	a:INTEGER is 5;
	b is 9.75;
	b is "abc";
	b is 'a';
	b is true;
	b is false;

	c is 1+2;
	c is 1-2;
	c is 1*2;
	c is 1/2;
	c is 1//2;
	c is 1\\2;
	c is 1 and 2;
	c is 1 or 2;
	c is 1 xor 2;
	c is 1 and then 2;
	c is 1 or else 2;
	c is a.b;
	c is 1 implies 2;
	c is 1=2;
	c is 1<2;
	c is 1<=2;
	c is 1>2;
	c is 1>=2;
	c is 1/=2;

	d is +a;
	d is -a;
	d is not a;
	d is old a;

	t is <<45,78>>;
	t is << >>;


invariant
	
	i=5;
	j=g(7);

end