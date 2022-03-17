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

object FA_PERSON_ENTERING_BOOTH: Icon {
	
	override val name get() = "Person Entering Booth"
	
	override val unicode get() = "f756"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M192 496C192 504.8 199.3 512 208 512h32C248.8 512 256 504.8 256 496V320H192V496zM544 0h-32v496c0 8.75 7.25 16 16 16h32c8.75 0 16-7.25 16-16V32C576 14.25 561.8 0 544 0zM64 128c26.5 0 48-21.5 48-48S90.5 32 64 32S16 53.5 16 80S37.5 128 64 128zM224 224H173.1L127.9 178.8C115.8 166.6 99.75 160 82.75 160H64C46.88 160 30.75 166.8 18.75 178.8c-12 12.12-18.72 28.22-18.72 45.35L0 480c0 17.75 14.25 32 31.88 32s32-14.25 32-32L64 379.3c.875 .5 1.625 1.375 2.5 1.75L95.63 424V480c0 17.75 14.25 32 32 32c17.62 0 32-14.25 32-32v-56.5c0-9.875-2.375-19.75-6.75-28.62l-41.13-61.25V253l20.88 20.88C141.8 283 153.8 288 166.5 288H224c17.75 0 32-14.25 32-32S241.8 224 224 224zM192 32v160h64V0H224C206.3 0 192 14.25 192 32zM288 32l31.5 223.1l-30.88 154.6C284.3 431.3 301.6 448 320 448c15.25 0 27.99-9.125 32.24-30.38C353.3 434.5 366.9 448 384 448c17.75 0 32-14.25 32-32c0 17.75 14.25 32 32 32s32-14.25 32-32V0h-192V32z"/></svg>"""
		else -> null
	}
	
}
