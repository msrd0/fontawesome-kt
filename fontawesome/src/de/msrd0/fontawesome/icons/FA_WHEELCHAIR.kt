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

object FA_WHEELCHAIR: Icon {
	
	override val name get() = "Wheelchair"
	
	override val unicode get() = "f193"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M510.3 421.9c-5.594-16.75-23.53-25.84-40.47-20.22l-19.38 6.438l-41.7-99.97C403.9 295.1 392.2 288 379.1 288h-97.78l-10.4-48h65.11c17.69 0 32-14.31 32-32s-14.31-32-32-32h-78.98L255.6 169.2C251.8 142.1 227.2 124.8 201.2 128.5C174.1 132.2 156.7 156.5 160.5 182.8l23.68 140.4C185.8 339.6 199.6 352 216 352h141.4l44.86 107.9C407.3 472.3 419.3 480 432 480c3.344 0 6.781-.5313 10.12-1.656l48-16C506.9 456.8 515.9 438.7 510.3 421.9zM160 464c-61.76 0-112-50.24-112-112c0-54.25 38.78-99.55 90.06-109.8L130.1 195C56.06 209 0 273.9 0 352c0 88.37 71.63 160 160 160c77.4 0 141.9-54.97 156.8-128h-49.1C252.9 430.1 210.6 464 160 464zM192 96c26.51 0 48-21.49 48-48S218.5 0 192 0S144 21.49 144 48S165.5 96 192 96z"/></svg>"""
		else -> null
	}
	
}
