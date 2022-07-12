class TEST12

feature

	a is
	do
	check
		x=5;
	end;
	check
		a:x=6;
	end;
	check
		a=b;
		b=c;
	end;
	check
		y:a=b;
		z=0;
		x:b=c;
	end;
	end

end