class GraphicalLibrary:

    @staticmethod
    def drawPoint(x, y, color):
        pass

    @staticmethod
    def drawLine(x1, y1, x2, y2, color):
        pass

    @staticmethod
    def drawRectangle(x, y, width, heigth, color):
        for i in range(heigth):
            print(color * width)
