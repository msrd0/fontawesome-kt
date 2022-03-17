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

object FA_CROSS: Icon {
	
	override val name get() = "Cross"
	
	override val unicode get() = "f654"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M383.1 160v64c0 17.62-14.37 32-31.1 32h-96v224c0 17.62-14.38 32-31.1 32H160c-17.62 0-32-14.38-32-32V256h-96C14.37 256-.0008 241.6-.0008 224V160c0-17.62 14.38-32 32-32h96V32c0-17.62 14.38-32 32-32h64c17.62 0 31.1 14.38 31.1 32v96h96C369.6 128 383.1 142.4 383.1 160z"/></svg>"""
		else -> null
	}
	
}
