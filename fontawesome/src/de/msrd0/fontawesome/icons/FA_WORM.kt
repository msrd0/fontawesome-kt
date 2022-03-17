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

object FA_WORM: Icon {
	
	override val name get() = "Worm"
	
	override val unicode get() = "e599"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 96C256 42.98 298.1 0 352 0H390.4C439.9 0 480 40.12 480 89.6V376C480 451.1 419.1 512 344 512C268.9 512 208 451.1 208 376V296C208 273.9 190.1 256 168 256C145.9 256 128 273.9 128 296V464C128 490.5 106.5 512 80 512C53.49 512 32 490.5 32 464V296C32 220.9 92.89 160 168 160C243.1 160 304 220.9 304 296V376C304 398.1 321.9 416 344 416C366.1 416 384 398.1 384 376V192H352C298.1 192 256 149 256 96zM376 64C362.7 64 352 74.75 352 88C352 101.3 362.7 112 376 112C389.3 112 400 101.3 400 88C400 74.75 389.3 64 376 64z"/></svg>"""
		else -> null
	}
	
}
