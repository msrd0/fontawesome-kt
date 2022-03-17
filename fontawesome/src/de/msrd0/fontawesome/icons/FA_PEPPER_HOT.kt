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

/** Hot Pepper */
object FA_PEPPER_HOT: Icon {
	
	override val name get() = "Hot Pepper"
	
	override val unicode get() = "f816"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M465 134.2c21.46-38.38 19.87-87.17-5.65-123.1c-7.541-10.83-22.31-13.53-33.2-5.938c-10.77 7.578-13.44 22.55-5.896 33.41c14.41 20.76 15.13 47.69 4.098 69.77C407.1 100.1 388 95.1 368 95.1c-36.23 0-68.93 13.83-94.24 35.92L352 165.5V256h90.56l33.53 78.23C498.2 308.9 512 276.2 512 239.1C512 198 493.7 160.6 465 134.2zM320 288V186.6l-52.95-22.69C216.2 241.3 188.5 400 56 400C25.13 400 0 425.1 0 456S25.13 512 56 512c180.3 0 320.1-88.27 389.3-168.5L421.5 288H320z"/></svg>"""
		else -> null
	}
	
}
