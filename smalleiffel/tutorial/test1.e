class TEST1

creation make

feature

	make is
	local
		i,j:INTEGER;
	do
		io.put_string("Coucou%N");
		i:=9;
		j:=7;
		!!ptr;
		ptr.set_item(i);
		i:=19;
		test1;
		affiche(ptr,9);
		from i:=0;
		until i>=10
		loop
			affiche(ptr,i);
			i:=i+1;
		end;
		io.put_string("Fin%N");
	end;

	test1 is
	local
		a,b:INTEGER;
	do
		a:=0;
		b:=b+1;
	end;

	affiche(p:INTEGER_REF;i:INTEGER) is
	do
		
		if p/=Void and then p.item=i then
			io.put_string("ptr="+p.item.to_string+"="+i.to_string+"%N");
		else
			io.put_string("ptr="+p.item.to_string+"!="+i.to_string+"%N");
		end
	end;

	ptr:INTEGER_REF;

end