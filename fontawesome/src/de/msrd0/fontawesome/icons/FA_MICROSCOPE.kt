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

/** Microscope */
object FA_MICROSCOPE: Icon {
	
	override val name get() = "Microscope"
	
	override val unicode get() = "f610"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M160 320h12v16c0 8.875 7.125 16 16 16h40c8.875 0 16-7.125 16-16V320H256c17.62 0 32-14.38 32-32V64c0-17.62-14.38-32-32-32V16C256 7.125 248.9 0 240 0h-64C167.1 0 160 7.125 160 16V32C142.4 32 128 46.38 128 64v224C128 305.6 142.4 320 160 320zM464 448h-1.25C493.2 414 512 369.2 512 320c0-105.9-86.13-192-192-192v64c70.63 0 128 57.38 128 128s-57.38 128-128 128H48C21.5 448 0 469.5 0 496C0 504.9 7.125 512 16 512h480c8.875 0 16-7.125 16-16C512 469.5 490.5 448 464 448zM104 416h208c4.375 0 8-3.625 8-8v-16c0-4.375-3.625-8-8-8h-208C99.63 384 96 387.6 96 392v16C96 412.4 99.63 416 104 416z"/></svg>"""
		else -> null
	}
	
}
