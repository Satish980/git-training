

MAX=10**(10**6)
def multiply(x, res, res_size):

	carry = 0
	for i in range(res_size):
		prod = res[i] * x + carry
		res[i] = prod % 10
		carry = prod // 10
	while (carry):
		res[res_size] = carry % 10
		carry = carry // 10
		res_size+=1

	return res_size


def power(x,n):
	
	if (n == 0) :
		print("1")
		return
	
	res=[0 for i in range(MAX)]
	res_size = 0
	temp = x

	# Initialize result
	while (temp != 0):
		res[res_size] = temp % 10;
		res_size+=1
		temp = temp // 10

	for i in range(2, n + 1):
		res_size = multiply(x, res, res_size)

	print(x , "^" , n , " = ")
	for i in range(res_size - 1, -1, -1):
		print(res[i])


# Driver program

exponent = 100
base = 2
power(base, exponent)

# This code is contributed
# by Anant Agarwal.
