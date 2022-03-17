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

/** Arrows Split-up-and-left */
object FA_ARROWS_SPLIT_UP_AND_LEFT: Icon {
	
	override val name get() = "Arrows Split-up-and-left"
	
	override val unicode get() = "e4bc"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M246.6 150.6C234.1 163.1 213.9 163.1 201.4 150.6C188.9 138.1 188.9 117.9 201.4 105.4L297.4 9.372C309.9-3.124 330.1-3.124 342.6 9.372L438.6 105.4C451.1 117.9 451.1 138.1 438.6 150.6C426.1 163.1 405.9 163.1 393.4 150.6L352 109.3V384C352 419.3 380.7 448 416 448H480C497.7 448 512 462.3 512 480C512 497.7 497.7 512 480 512H416C345.3 512 288 454.7 288 384C288 348.7 259.3 320 224 320H109.3L150.6 361.4C163.1 373.9 163.1 394.1 150.6 406.6C138.1 419.1 117.9 419.1 105.4 406.6L9.38 310.6L9.305 310.6C3.575 304.8 .0259 296.9 .0003 288.1L2.428 275.8C3.99 271.1 6.305 268.4 9.372 265.4L105.4 169.4C117.9 156.9 138.1 156.9 150.6 169.4C163.1 181.9 163.1 202.1 150.6 214.6L109.3 255.1H224C247.3 255.1 269.2 262.2 288 273.1V109.3L246.6 150.6zM0 287.9C.0125 283.6 .8749 279.5 2.428 275.8C.8214 279.6 .0122 283.8 0 287.9zM0 288.1V287.1V287.9V288.1z"/></svg>"""
		else -> null
	}
	
}
