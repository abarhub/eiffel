class TEST5

feature

	--tata is a+b*c-d<e>f<=g>=h=i/=j/k//l\\m and n or o implies p xor q and then r or else s ^ t . u @ v;

-- . et not

	tata is not a . b;
	tata is (not a) . b;
	tata is not (a) . b;
	tata is not (a . b);

	tata is + a . b;
	tata is - a . b;
	tata is @ a . b;

-- not et free_op binaire

	tata is not a @ b;
	tata is + a @ b;
	tata is - a @ b;
	tata is @ a @ b;

-- free_op binaire et ^

	tata is a ^ b @ c;
	tata is a @ b ^ c;

-- ^ et *

	tata is a * b ^ c;
	tata is a / b ^ c;
	tata is a // b ^ c;
	tata is a \\ b ^ c;

	tata is a ^ b * c;
	tata is a ^ b / c;
	tata is a ^ b // c;
	tata is a ^ b \\ c;

-- * et +

	tata is a + b * c;
	tata is a + b / c;
	tata is a + b // c;
	tata is a + b \\ c;

	tata is a - b * c;
	tata is a - b / c;
	tata is a - b // c;
	tata is a - b \\ c;

	tata is a * b + c;
	tata is a / b + c;
	tata is a // b + c;
	tata is a \\ b + c;

	tata is a * b - c;
	tata is a / b - c;
	tata is a // b - c;
	tata is a \\ b - c;

-- + et =

	tata is a + b = c;
	tata is a + b /= c;
	tata is a + b < c;
	tata is a + b > c;
	tata is a + b <= c;
	tata is a + b >= c;

	tata is a - b = c;
	tata is a - b /= c;
	tata is a - b < c;
	tata is a - b > c;
	tata is a - b <= c;
	tata is a - b >= c;

	tata is a = b + c;
	tata is a /= b + c;
	tata is a < b + c;
	tata is a > b + c;
	tata is a <= b + c;
	tata is a >= b + c;

	tata is a = b - c;
	tata is a /= b - c;
	tata is a < b - c;
	tata is a > b - c;
	tata is a <= b - c;
	tata is a >= b - c;

-- = et and

	tata is a and b = c;
	tata is a and b /= c;
	tata is a and b < c;
	tata is a and b > c;
	tata is a and b <= c;
	tata is a and b >= c;

	tata is a and then b = c;
	tata is a and then b /= c;
	tata is a and then b < c;
	tata is a and then b > c;
	tata is a and then b <= c;
	tata is a and then b >= c;

	tata is a = b and c;
	tata is a /= b and c;
	tata is a < b and c;
	tata is a > b and c;
	tata is a <= b and c;
	tata is a >= b and c;

	tata is a = b and then c;
	tata is a /= b and then c;
	tata is a < b and then c;
	tata is a > b and then c;
	tata is a <= b and then c;
	tata is a >= b and then c;

-- and et or

	tata is a and b or c;
	tata is a and b or else c;
	tata is a and then b or c;
	tata is a and then b or else c;

	tata is a or b and c;
	tata is a or else b and c;
	tata is a or b and then c;
	tata is a or else b and then c;

-- or et implies

	tata is a implies b or c;
	tata is a implies b or else c;
	tata is a or b implies c;
	tata is a or else b implies c;

end