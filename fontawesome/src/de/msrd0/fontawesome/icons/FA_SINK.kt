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

object FA_SINK: Icon {
	
	override val name get() = "Sink"
	
	override val unicode get() = "e06d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M496 288h-96V256l64 .0002c8.838 0 16-7.164 16-15.1v-15.1c0-8.838-7.162-16-16-16L384 208c-17.67 0-32 14.33-32 32v47.1l-64 .0005v-192c0-17.64 14.36-32 32-32s32 14.36 32 32v16c0 8.836 7.164 16 16 16h32c8.838 0 16-7.164 16-16v-16c0-59.2-53.85-106-115.1-94.14C255.3 10.71 224 53.36 224 99.79v188.2L160 288V240c0-17.67-14.33-32-32-32L48 208c-8.836 0-16 7.162-16 16v15.1C32 248.8 39.16 256 48 256l64-.0002V288h-96c-8.836 0-16 7.164-16 16v32c0 8.836 7.164 16 16 16h480c8.836 0 16-7.164 16-16V304C512 295.2 504.8 288 496 288zM32 416c0 53.02 42.98 96 96 96h256c53.02 0 96-42.98 96-96v-32H32V416z"/></svg>"""
		else -> null
	}
	
}
