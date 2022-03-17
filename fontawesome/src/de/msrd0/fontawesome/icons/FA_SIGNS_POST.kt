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

object FA_SIGNS_POST: Icon {
	
	override val name get() = "Signs post"
	
	override val unicode get() = "f277"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M223.1 32C223.1 14.33 238.3 0 255.1 0C273.7 0 288 14.33 288 32H441.4C445.6 32 449.7 33.69 452.7 36.69L500.7 84.69C506.9 90.93 506.9 101.1 500.7 107.3L452.7 155.3C449.7 158.3 445.6 160 441.4 160H63.1C46.33 160 31.1 145.7 31.1 128V64C31.1 46.33 46.33 32 63.1 32L223.1 32zM480 320C480 337.7 465.7 352 448 352H70.63C66.38 352 62.31 350.3 59.31 347.3L11.31 299.3C5.065 293.1 5.065 282.9 11.31 276.7L59.31 228.7C62.31 225.7 66.38 223.1 70.63 223.1H223.1V191.1H288V223.1H448C465.7 223.1 480 238.3 480 255.1V320zM255.1 512C238.3 512 223.1 497.7 223.1 480V384H288V480C288 497.7 273.7 512 255.1 512z"/></svg>"""
		else -> null
	}
	
}

val FA_MAP_SIGNS = FA_SIGNS_POST
