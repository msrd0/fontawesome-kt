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

object FA_PERSON_MILITARY_POINTING: Icon {
	
	override val name get() = "Person Military-pointing"
	
	override val unicode get() = "e54a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M366.7 1.443C376 .6658 384 8.027 384 17.39V47.1C384 56.84 376.8 63.1 368 63.1H216.1C203.2 63.1 192 52.81 192 39C192 25.1 201.1 15.17 214.9 14.09L366.7 1.443zM208 111.1C208 106.5 208.6 101.2 209.6 95.1H366.4C367.5 101.2 368 106.5 368 111.1C368 156.2 332.2 191.1 288 191.1C243.8 191.1 208 156.2 208 111.1V111.1zM313.2 223.1C327.6 223.1 341.6 226.3 354.9 230.5L192 393.4V303.1H40.01C17.92 303.1 .0077 286.1 .0077 263.1C.0077 241.9 17.92 223.1 40.01 223.1H313.2zM430.3 290.8L506.4 419.7C517.7 438.7 511.4 463.2 492.4 474.4C473.3 485.7 448.8 479.4 437.6 460.3L384 369.7V416H214.6L385.7 244.9C403.7 256.3 419.1 271.9 430.3 290.8V290.8zM384 448V480C384 497.7 369.7 512 352 512H224C206.3 512 192 497.7 192 480V448H384z"/></svg>"""
		else -> null
	}
	
}
