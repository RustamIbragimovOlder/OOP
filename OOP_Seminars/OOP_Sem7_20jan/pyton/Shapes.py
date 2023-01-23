from abc import ABC, abstractmethod
from math import pi
from typing import List

class Shape(ABC):
    @abstractmethod
    def get_area():
        pass

class SquareShape(Shape):
    def __init__(self, side):
        self.side = side

    def get_area(self):
        return self.side * self.side

class CircleShape(Shape):
    def __init__(self, radius):
        self.radius = radius

    def get_area(self):
        return pi * self.radius * self.radius

shapes: List[Shape] = [SquareShape(1), CircleShape(1)]

for shape in shapes:
    print(shape.get_area())
