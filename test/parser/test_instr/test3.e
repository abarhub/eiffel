class TEST3

feature

	a is
	do
	x:=0;
	x?=0;
	x(1,2);
	Current.x(1,2).ta; --?=5;
	Current.x :=5;
	Current.x ?=5;
	end

end