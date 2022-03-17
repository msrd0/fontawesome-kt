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

object FA_GAUGE_SIMPLE: Icon {
	
	override val name get() = "Gauge simple"
	
	override val unicode get() = "f62a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM304.7 310.4L381.3 163.1C387.4 151.3 382.8 136.8 371.1 130.7C359.3 124.6 344.8 129.2 338.7 140.9L262.1 288.3C260.1 288.1 258.1 287.1 255.1 287.1C220.7 287.1 191.1 316.7 191.1 352C191.1 387.3 220.7 416 255.1 416C291.3 416 320 387.3 320 352C320 336.1 314.2 321.6 304.7 310.4L304.7 310.4z"/></svg>"""
		else -> null
	}
	
}

val FA_TACHOMETER = FA_GAUGE_SIMPLE

val FA_TACHOMETER_FAST = FA_GAUGE_SIMPLE
