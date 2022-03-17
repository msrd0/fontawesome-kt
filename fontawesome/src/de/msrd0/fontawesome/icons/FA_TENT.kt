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

object FA_TENT: Icon {
	
	override val name get() = "Tent"
	
	override val unicode get() = "e57d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M269.4 5.961C280.5-1.987 295.5-1.987 306.6 5.961L530.6 165.1C538 171.2 542.8 179.4 543.8 188.5L575.8 476.5C576.8 485.5 573.9 494.6 567.8 501.3C561.8 508.1 553.1 512 544 512H416L288 288V512H32C22.9 512 14.23 508.1 8.156 501.3C2.086 494.6-.8093 485.5 .1958 476.5L32.2 188.5C33.2 179.4 38 171.2 45.4 165.1L269.4 5.961z"/></svg>"""
		else -> null
	}
	
}
