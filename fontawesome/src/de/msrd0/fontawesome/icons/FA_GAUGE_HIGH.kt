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

/** Gauge */
object FA_GAUGE_HIGH: Icon {
	
	override val name get() = "Gauge"
	
	override val unicode get() = "f625"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 64C238.3 64 224 78.33 224 96C224 113.7 238.3 128 256 128C273.7 128 288 113.7 288 96C288 78.33 273.7 64 256 64zM256 416C291.3 416 320 387.3 320 352C320 334.6 313.1 318.9 301.9 307.4L365.1 161.7C371.3 149.5 365.8 135.4 353.7 130C341.5 124.7 327.4 130.2 322 142.3L257.9 288C257.3 288 256.6 287.1 256 287.1C220.7 287.1 192 316.7 192 352C192 387.3 220.7 416 256 416V416zM144 112C126.3 112 112 126.3 112 144C112 161.7 126.3 176 144 176C161.7 176 176 161.7 176 144C176 126.3 161.7 112 144 112zM96 288C113.7 288 128 273.7 128 256C128 238.3 113.7 224 96 224C78.33 224 64 238.3 64 256C64 273.7 78.33 288 96 288zM416 224C398.3 224 384 238.3 384 256C384 273.7 398.3 288 416 288C433.7 288 448 273.7 448 256C448 238.3 433.7 224 416 224z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_GAUGE_HIGH]. */
val FA_TACHOMETER_ALT = FA_GAUGE_HIGH

/** Alias for [FA_GAUGE_HIGH]. */
val FA_TACHOMETER_ALT_FAST = FA_GAUGE_HIGH
