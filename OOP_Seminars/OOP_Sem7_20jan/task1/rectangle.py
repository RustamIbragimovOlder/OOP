from graphical_lib import GraphicalLibrary as gl

class CalcRectangle:

    def __init__(self, width, heigth):
        self._width = width
        self._heigth = heigth

    @property
    def width(self):
        return self._width

    @property
    def heigth(self):
        return self._heigth

    @property
    def area(self):
        return self._width * self._heigth


class DrawRectangle:

    def __init__(self, calc_rectangle: CalcRectangle):
        self._calc_rectangle = calc_rectangle

    def draw(self):
        gl.drawRectangle(0, 0, self._calc_rectangle.width, self._calc_rectangle.heigth, '#')

    



