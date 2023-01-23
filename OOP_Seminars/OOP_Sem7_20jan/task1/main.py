# Возьмите код от любой задачи из прошлого семинара (принципы SOLID).
# Перепишите его на любой другой язык программирования на ваш выбор.

from rectangle import DrawRectangle as dr
from rectangle import CalcRectangle as cr

drawRectangle = dr(cr(8, 8))

drawRectangle.draw()
