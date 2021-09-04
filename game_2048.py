def checkzero_left():
  '''
  function to eliminate all zeros and put it on the back of the list
  '''
	global matrix
	for i in range(len(matrix)):
		for j in range(len(matrix[i])):
			if matrix[i][j] == 0:
				matrix[i].pop(j)
				matrix[i].append(0)
	return matrix

def left():
  '''
  function to be processed when 0 is called.
  Will check the zeros and put it on the back for every list,
  and for each list in matrix, it will check whether the one element
  have the same value with the element in it's right.
  After all the process has been done, print the matrix.
  '''
	global matrix
	matrix = checkzero_left()
	matrix = checkzero_left()
	for i in range(len(matrix)):
		for j in range(len(matrix[i])):
			if j != len(matrix[i]) - 1 and matrix[i][j] == matrix[i][j + 1]:
				matrix[i][j] += matrix[i][j + 1]
				matrix[i].pop(j + 1)
				matrix[i].append(0)
	for i in range(0, 4):
		for j in range(0, 4):
			if j == 3:
				print(matrix[i][j])
			else:
				print(matrix[i][j], end = ' ')

def reconstruct():
  '''
  Reconstruct the matrix so the rows wil be the columns and otherwise.
  '''
	global matrix
	new_matrix = []
	for i in range(0, 4):
		temp = []
		for j in range(0, 4):
			temp.append(matrix[j][i])
		new_matrix.append(temp)
	return new_matrix

def up():
  '''
  function to be processed when 1 is called.
  it will reconstruct the matrix so the columns wil be the rows and otherwise. 
  Will check the zeros and put it on the back for every list,
  and for each list in matrix, it will check whether the one element
  have the same value with the element in it's right.
  After all the process has been done, print the matrix.
  '''
	global matrix
	matrix = reconstruct()
	matrix = checkzero_left()
	matrix = checkzero_left()
	for i in range(len(matrix)):
		for j in range(len(matrix[i])):
			if j != len(matrix[i]) - 1 and matrix[i][j] == matrix[i][j + 1]:
				matrix[i][j] += matrix[i][j + 1]
				matrix[i].pop(j + 1)
				matrix[i].append(0)
	matrix = reconstruct()
	for i in range(0, 4):
		for j in range(0, 4):
			if j == 3:
				print(matrix[i][j])
			else:
				print(matrix[i][j], end = ' ')

def checkzero_right():
  '''
  function to eliminate all zeros and put it on the top of the list
  '''
	global matrix
	for i in range(len(matrix)):
		for j in range(len(matrix[i]) - 1, 0, -1):
			if matrix[i][j] == 0:
				matrix[i].pop(j)
				matrix[i].insert(0, 0)
	return matrix

def right():
  '''
  function to be processed when 2 is called.
  Will check the zeros and put it on the top for every list,
  and for each list in matrix, it will check whether the one element
  have the same value with the element in it's left.
  After all the process has been done, print the matrix.
  '''
	global matrix
	matrix = checkzero_right()
	matrix = checkzero_right()
	for i in range(len(matrix)):
		for j in range(len(matrix[i]) - 1, 0, -1):
			if j != 0 and matrix[i][j] == matrix[i][j - 1]:
				matrix[i][j] += matrix[i][j - 1]
				matrix[i].pop(j - 1)
				matrix[i].insert(0, 0)
	for i in range(0, 4):
		for j in range(0, 4):
			if j == 3:
				print(matrix[i][j])
			else:
				print(matrix[i][j], end = ' ')
        
def down():
  '''
  function to be processed when 3 is called.
  it will reconstruct the matrix so the columns wil be the rows and otherwise. 
  Will check the zeros and put it on the top for every list,
  and for each list in matrix, it will check whether the one element
  have the same value with the element in it's left.
  After all the process has been done, print the matrix.
  '''
	global matrix
	matrix = reconstruct()
	matrix = checkzero_right()
	matrix = checkzero_right()
	for i in range(len(matrix)):
		for j in range(len(matrix[i]) - 1, 0, -1):
			if j != 0 and matrix[i][j] == matrix[i][j - 1]:
				matrix[i][j] += matrix[i][j - 1]
				matrix[i].pop(j - 1)
				matrix[i].insert(0, 0)
	matrix = reconstruct()
	for i in range(0, 4):
		for j in range(0, 4):
			if j == 3:
				print(matrix[i][j])
			else:
				print(matrix[i][j], end = ' ')

matrix = []

for i in range(0,4):
	inp = str(input()).split()
	inp = [int(x) for x in inp]
	matrix.append(inp)

command = int(input())

if command == 0:
	left()
elif command == 1:
	up()
elif command == 2:
	right()
elif command == 3:
	down()
