package LTI

class testIt {
    companion object{
        fun testIt(bemenet: String, result: String): String
        {
            var számok = IntArray(10000)
            var g=0
            var akt = ""
            var vege=0
            var i=0
            while (i<bemenet.length) {
                if (i+2>bemenet.length){}
                else if (bemenet.substring(i,i+2).equals(", ")){
                    számok[g]= Integer.valueOf(akt)
                    g++
                    akt = ""
                    i+=2
                }
                akt += bemenet.substring(i, i + 1)
                i++
            }
            számok[g] = Integer.valueOf(akt)
            var akthely: Int
            var elözöhely = 0
            var robot_benz = 300
            i = 0
            while (i < g + 1) {
                if (számok[i] % 30 == 0) {
                    akthely = 7
                } else if (számok[i] % 15 == 0) {
                    akthely = 4
                } else if (számok[i] % 10 == 0) {
                    akthely = 13
                } else if (számok[i] % 6 == 0) {
                    akthely = 10
                } else if (számok[i] % 2 == 0) {
                    akthely = 8
                } else if (számok[i] % 3 == 0) {
                    akthely = 0
                } else if (számok[i] % 5 == 0) {
                    akthely = 2
                } else {
                    akthely = 5
                }
                if (robot_benz - (Math.abs(akthely - elözöhely) * 5 + 1) >= Math.abs(akthely - -1) * 6) {
                    vege += Math.abs(akthely - elözöhely) * 5 + 1
                    robot_benz -= Math.abs(akthely - elözöhely) * 5 + 1
                    elözöhely = akthely
                } else {
                    vege += Math.abs(akthely - -1) * 6
                    elözöhely = 6
                    i--
                    robot_benz = 300
                }
                i++
            }
            if (vege==Integer.valueOf(result))
            {
                return "Helyes"
            }
            else
            {
                return "Helytelen"
            }
        }
    }
}