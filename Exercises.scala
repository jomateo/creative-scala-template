import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object Exercises {
    // ((circle(100) fillColor Color.darkBlue) under (circle(80) fillColor Color.white) under (circle(60) fillColor Color.cornflowerBlue) under (circle(40) fillColor Color.black)).draw

    // (triangle (100, 100) fillColor Color.hsl(0.degrees, 0.8.normalized, 0.6.normalized)).draw

    // (((circle(100) fillColor Color.red) beside
    // (circle(100) fillColor Color.red.spin(15.degrees)) beside
    // (circle(100) fillColor Color.red.spin(30.degrees))).lineWidth(5.0)).draw

    // ((triangle(100, 100)
    //     lineWidth 6.0
    //     lineColor Color.darkSlateBlue
    //     fillColor (Color.darkSlateBlue lighten 0.3.normalized saturate 0.2.normalized spin 10.degrees)) above
    // ((triangle(100, 100)
    //     lineWidth 6.0
    //     lineColor (Color.darkSlateBlue spin(-30.degrees))
    //     fillColor (Color.darkSlateBlue lighten 0.3.normalized saturate 0.2.normalized spin (-20.degrees))) beside
    // (triangle(100, 100)
    //     lineWidth 6.0
    //     lineColor (Color.darkSlateBlue spin(30.degrees))
    //     fillColor (Color.darkSlateBlue lighten 0.3.normalized saturate 0.2.normalized spin(40.degrees))))).draw


        // (((circle(99)
        //     fillColor (Color.red)
        //     lineWidth 3.0) under
        // (circle(66)
        //     fillColor (Color.white)
        //     lineWidth 3.0) under
        // (circle(33)
        //     fillColor (Color.red)
        //     lineWidth 3.0)) above
        // ((rectangle(33, 132)
        //     fillColor (Color.white)
        //     lineWidth 2.0) above
        // (rectangle(66, 33)
        //     fillColor (Color.brown)
        //     lineWidth 2.0) above
        // (rectangle(198, 66)
        //     fillColor (Color.green)
        //     lineWidth 0))).draw

    (circle(100) fillColor Color.paleGoldenrod lineColor Color.indianRed).draw
}
