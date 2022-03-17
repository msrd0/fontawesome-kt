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

object FA_RADIO: Icon {
	
	override val name get() = "Radio"
	
	override val unicode get() = "f8d7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M447.1 128L218.5 128l276.2-80.97c12.72-3.734 19.1-17.06 16.28-29.78c-3.719-12.7-16.1-19.1-29.78-16.28L51.75 126.9c-29.07 8.512-49.55 34.8-51.39 64.78L.0007 192v255.1c0 35.31 28.69 63.1 63.1 63.1h383.1c35.31 0 63.1-28.69 63.1-63.1V192C511.1 156.7 483.3 128 447.1 128zM80 248c0-4.406 3.594-7.1 7.1-7.1h111.1c4.406 0 7.1 3.594 7.1 7.1V263.1c0 4.406-3.594 7.1-7.1 7.1h-111.1c-4.406 0-7.1-3.594-7.1-7.1V248zM208 391.1c0 4.406-3.594 7.1-7.1 7.1h-111.1c-4.406 0-7.1-3.594-7.1-7.1v-15.1c0-4.406 3.594-7.1 7.1-7.1h111.1c4.406 0 7.1 3.594 7.1 7.1V391.1zM224 327.1c0 4.406-3.594 7.1-7.1 7.1H72c-4.406 0-7.1-3.594-7.1-7.1V311.1c0-4.406 3.594-7.1 7.1-7.1h143.1c4.406 0 7.1 3.594 7.1 7.1V327.1zM367.1 399.1c-44.16 0-80-35.84-80-79.1s35.84-80 80-80s79.1 35.85 79.1 80S412.2 399.1 367.1 399.1z"/></svg>"""
		else -> null
	}
	
}
