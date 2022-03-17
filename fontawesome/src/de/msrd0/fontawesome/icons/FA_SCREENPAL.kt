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
import de.msrd0.fontawesome.Style.BRANDS

/** Screenpal */
object FA_SCREENPAL: Icon {
	
	override val name get() = "Screenpal"
	
	override val unicode get() = "e570"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M233.5 22.49C233.5 10.07 243.6 0 256 0C268.4 0 278.5 10.07 278.5 22.49C278.5 34.91 268.4 44.98 256 44.98C243.6 44.98 233.5 34.91 233.5 22.49zM313.4 259C313.4 290.7 287.7 316.4 256 316.4C224.3 316.4 198.6 290.7 198.6 259C198.6 227.3 224.3 201.6 256 201.6C287.7 201.6 313.4 227.3 313.4 259zM337.2 350C359.5 330.1 373.7 302.7 377.1 273H496.6C493.1 334.4 466.2 392.2 421.4 434.4C376.7 476.6 317.5 500.2 256 500.2C194.5 500.2 135.3 476.6 90.56 434.4C45.83 392.2 18.94 334.4 15.39 273H135.1C138.5 302.7 152.7 330.1 175 350C197.3 369.9 226.2 380.9 256.1 380.9C285.1 380.9 314.8 369.9 337.2 350zM73.14 140.3C73.54 152.7 63.81 163.1 51.39 163.5C38.97 163.9 28.59 154.2 28.18 141.8C27.78 129.3 37.52 118.9 49.94 118.5C62.35 118.1 72.74 127.9 73.14 140.3zM438.9 141C438.9 128.6 448.9 118.5 461.4 118.5C473.8 118.5 483.8 128.6 483.8 141C483.8 153.5 473.8 163.5 461.4 163.5C448.9 163.5 438.9 153.5 438.9 141zM317.9 95.27C300.6 109.1 278.7 118.1 256 118.1C233.3 118.1 211.4 109.1 194.1 95.27C176.8 80.55 165.3 60.18 161.7 37.78C176.8 31.37 192.5 26.52 208.6 23.31C208.6 35.88 213.6 47.93 222.5 56.82C231.4 65.7 243.4 70.7 256 70.7C268.6 70.7 280.6 65.7 289.5 56.82C298.4 47.93 303.4 35.88 303.4 23.31C319.5 26.52 335.2 31.37 350.3 37.78C346.7 60.18 335.2 80.55 317.9 95.27H317.9zM82.78 231C61.42 238.6 38.06 238.4 16.86 230.4C18.82 214.1 22.46 198.1 27.71 182.5C33.1 185.6 39.05 187.6 45.22 188.5C51.39 189.3 57.67 188.9 63.68 187.3C69.69 185.6 75.33 182.9 80.27 179.1C85.21 175.3 89.36 170.6 92.47 165.2C95.58 159.8 97.61 153.8 98.42 147.7C99.23 141.5 98.83 135.2 97.22 129.2C95.61 123.2 92.83 117.6 89.04 112.6C85.25 107.7 80.53 103.5 75.14 100.4C85.96 88.11 98.01 76.94 111.1 67.07C128.7 81.42 140.6 101.6 144.7 123.9C148.8 146.2 144.8 169.3 133.5 188.9C122.1 208.5 104.1 223.4 82.78 231V231zM429.2 231.1C407.9 223.5 389.9 208.5 378.5 188.9C367.2 169.3 363.3 146.2 367.4 123.9C371.5 101.7 383.4 81.54 400.9 67.19C414 77.04 426.1 88.21 436.9 100.5C426.2 106.9 418.5 117.2 415.4 129.3C412.2 141.3 413.1 154.1 420.2 164.9C426.4 175.7 436.6 183.6 448.6 186.9C460.6 190.2 473.5 188.6 484.3 182.6C489.6 198.1 493.2 214.2 495.2 230.4C473.1 238.5 450.6 238.7 429.2 231.1L429.2 231.1z"/></svg>"""
		else -> null
	}
	
}
