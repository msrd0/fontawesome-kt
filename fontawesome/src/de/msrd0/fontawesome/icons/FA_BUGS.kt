/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Bugs */
object FA_BUGS: Icon {
	
	override val name get() = "Bugs"
	
	override val unicode get() = "e4d0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M187.3 135.1H204.3L208.5 115.3C211.1 102.3 223.7 93.86 236.7 96.46C249.7 99.06 258.1 111.7 255.5 124.7L247.5 164.7C245.3 175.9 235.4 183.1 223.1 183.1H191.1V207.3L229.8 216.7C239.3 219.1 246.4 226.9 247.8 236.6L255.8 292.6C257.6 305.7 248.5 317.9 235.4 319.8C222.3 321.6 210.1 312.5 208.2 299.4L202.5 259.4L184.1 254.8C173.2 274.6 152.2 287.1 127.1 287.1C103.8 287.1 82.75 274.6 71.87 254.8L53.48 259.4L47.76 299.4C45.88 312.5 33.73 321.6 20.61 319.8C7.484 317.9-1.633 305.7 .2413 292.6L8.241 236.6C9.621 226.9 16.71 219.1 26.18 216.7L63.1 207.3V183.1H31.1C20.56 183.1 10.71 175.9 8.463 164.7L.4627 124.7C-2.137 111.7 6.292 99.06 19.29 96.46C32.29 93.86 44.93 102.3 47.53 115.3L51.67 135.1H68.65C73.35 124.4 81.36 114.5 91.51 107.4L58.15 33.92C52.67 21.85 58.01 7.625 70.08 2.145C82.15-3.335 96.37 2.007 101.9 14.08L128 71.66L154.1 14.08C159.6 2.007 173.9-3.335 185.9 2.145C197.1 7.625 203.3 21.85 197.9 33.92L164.5 107.4C174.6 114.5 182.6 124.4 187.3 135.1L187.3 135.1zM501.5 322.7L516.2 331.2L530.1 315.3C538.9 305.3 554 304.4 563.1 313.1C573.9 321.9 574.9 337 566.2 346.1L539.2 377.6C531.7 386.2 519.1 388.3 509.2 382.6L481.5 366.6L469.9 386.7L497.9 413.8C504.9 420.6 507.1 430.9 503.5 440L482.4 492.5C477.5 504.8 463.5 510.8 451.2 505.8C438.9 500.9 432.9 486.9 437.9 474.6L452.9 437.1L439.3 423.9C419.1 435.6 395 436.7 374.1 424.6C353.1 412.5 341.6 390.4 342.1 367.8L323.8 362.6L298.9 394.4C290.7 404.8 275.6 406.6 265.2 398.4C254.8 390.3 252.9 375.2 261.1 364.7L296 320.2C302.1 312.6 312.1 309.3 321.5 311.1L359 322.7L370.6 302.6L342.9 286.6C333 280.8 328.5 268.9 332.2 258.1L345.3 219.4C349.5 206.9 363.1 200.2 375.7 204.4C388.2 208.7 394.1 222.3 390.7 234.8L383.1 254.8L398.7 263.3C408.5 255.6 420.4 251 432.8 249.1L440.6 169.7C441.9 156.5 453.6 146.8 466.8 148.1C480 149.4 489.7 161.1 488.4 174.3L482.2 237.3L533.7 200.5C544.5 192.8 559.4 195.3 567.2 206C574.9 216.8 572.4 231.8 561.6 239.5L495.1 286.5C501.2 297.7 503.2 310.3 501.5 322.7V322.7z"/></svg>"""
		else -> null
	}
	
}