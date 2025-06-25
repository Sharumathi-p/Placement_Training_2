import turtle
def draw_star():
    window = turtle.Screen()
    window.bgcolor("white")

    pen = turtle.Turtle()
    pen.color("blue")
    pen.pensize(2)

    for _ in range(5):
        pen.forward(100)
        pen.right(144)

    window.mainloop()

if _name_ == "_main_":
    draw_star()
