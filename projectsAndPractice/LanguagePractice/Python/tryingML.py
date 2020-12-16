import torch
print('this is a normal tensor')
t1 = torch.tensor(4.)#most times data will be floating point
print(t1)
print(t1.dtype)
#more complex tensor
print('This is a tensor containing a vector')
t2 = torch.tensor([1.,2,3,4])
print(t2, 'the data type for the vector has to be cohesive, so this became a float since the first value was a float.')
#matrix tensor
print('this tensor has matrix')
t3 = torch.tensor([[1.0, 2], [1, 3], [3, 4]])
print(t3, 'only one piece of data per tensor, this one is a matrix')
t4 = torch.tensor([[[1., 2, 3], [3, 4, 5]], [[2, 3, 1], [5, 4, 2]]])
print(t4, 'this is a 3-dimensional array, every nested element needs to be the same size when compared to other elements nested at the same level.')
'''
----------------------------------------------------------------------
TENSOR OPERATIONS AND GRADIENTS
----------------------------------------------------------------------
'''
x = torch.tensor(3.)
w = torch.tensor(4., requires_grad=True)
b = torch.tensor(5., requires_grad=True)

y = w * x + b
print(y, 'as expected, y is a tensor with value 17, what makes pyTorch special is that we can automatically compute the derivative of y with respect to the tensors that have \'requires_grad\' set to true. to compute the derivatives we call the .backward() method.')
print(y.backward())

# to make sure the supplied value is a tensor use the .length() method to see it's shape
print('.shape method',
y.shape(),
t1.shape(),
t2.shape(),
t3.shape(),
t4.shape(),
x.shape(),
w.shape(),
b.shape(),
)

print('Matrix dot products')
g = torch.tensor
