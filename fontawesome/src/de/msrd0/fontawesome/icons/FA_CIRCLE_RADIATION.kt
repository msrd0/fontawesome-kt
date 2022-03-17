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

object FA_CIRCLE_RADIATION: Icon {
	
	override val name get() = "Circle radiation"
	
	override val unicode get() = "f7ba"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M226.4 208.6L184.8 141.9C179.6 133.7 168.3 132 160.7 138.2C130.8 162.3 110.1 197.4 105.1 237.4C103.9 247.2 111.2 256 121 256H200C200 236 210.6 218.6 226.4 208.6zM256 288c17.67 0 32-14.33 32-32s-14.33-32-32-32C238.3 224 224 238.3 224 256S238.3 288 256 288zM285.6 303.3C276.1 308.7 266.9 312 256 312c-10.89 0-20.98-3.252-29.58-8.65l-41.74 66.8c-5.211 8.338-1.613 19.07 7.27 23.29C211.4 402.7 233.1 408 256 408c22.97 0 44.64-5.334 64.12-14.59c8.883-4.219 12.48-14.95 7.262-23.29L285.6 303.3zM351.4 138.2c-7.604-6.145-18.86-4.518-24.04 3.77l-41.71 66.67C301.4 218.6 312 236 312 256h78.96c9.844 0 17.11-8.791 15.91-18.56C401.9 197.5 381.3 162.4 351.4 138.2zM256 16C123.4 16 16 123.4 16 256s107.4 240 240 240c132.6 0 240-107.4 240-240S388.6 16 256 16zM256 432c-97.05 0-176-78.99-176-176S158.1 80 256 80s176 78.95 176 176S353 432 256 432z"/></svg>"""
		else -> null
	}
	
}

val FA_RADIATION_ALT = FA_CIRCLE_RADIATION
