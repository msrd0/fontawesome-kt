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

/** Comment sms */
object FA_COMMENT_SMS: Icon {
	
	override val name get() = "Comment sms"
	
	override val unicode get() = "f7cd"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 32C114.6 32 .0137 125.1 .0137 240c0 49.59 21.39 95 56.99 130.7c-12.5 50.39-54.31 95.3-54.81 95.8C0 468.8-.5938 472.2 .6875 475.2C1.1 478.2 4.813 480 8 480c66.31 0 116-31.8 140.6-51.41C181.3 440.9 217.6 448 256 448C397.4 448 512 354.9 512 240S397.4 32 256 32zM167.3 271.9C163.9 291.1 146.3 304 121.1 304c-4.031 0-8.25-.3125-12.59-1C101.1 301.8 92.81 298.8 85.5 296.1c-8.312-3-14.06-12.66-11.09-20.97S85 261.1 93.38 264.9c6.979 2.498 14.53 5.449 20.88 6.438C125.7 273.1 135 271 135.8 266.4c1.053-5.912-10.84-8.396-24.56-12.34c-12.12-3.531-44.28-12.97-38.63-46c4.062-23.38 27.31-35.91 58-31.09c5.906 .9062 12.44 2.844 18.59 4.969c8.344 2.875 12.78 12 9.906 20.34C156.3 210.7 147.2 215.1 138.8 212.2c-4.344-1.5-8.938-2.938-13.09-3.594c-11.22-1.656-20.72 .4062-21.5 4.906C103.2 219.2 113.6 221.5 124.4 224.6C141.4 229.5 173.1 238.5 167.3 271.9zM320 288c0 8.844-7.156 16-16 16S288 296.8 288 288V240l-19.19 25.59c-6.062 8.062-19.55 8.062-25.62 0L224 240V288c0 8.844-7.156 16-16 16S192 296.8 192 288V192c0-6.875 4.406-12.1 10.94-15.18c6.5-2.094 13.71 .0586 17.87 5.59L256 229.3l35.19-46.93c4.156-5.531 11.4-7.652 17.87-5.59C315.6 179 320 185.1 320 192V288zM439.3 271.9C435.9 291.1 418.3 304 393.1 304c-4.031 0-8.25-.3125-12.59-1c-8.25-1.25-16.56-4.25-23.88-6.906c-8.312-3-14.06-12.66-11.09-20.97s10.59-13.16 18.97-10.19c6.979 2.498 14.53 5.449 20.88 6.438c11.44 1.719 20.78-.375 21.56-4.938c1.053-5.912-10.84-8.396-24.56-12.34c-12.12-3.531-44.28-12.97-38.63-46c4.031-23.38 27.25-35.91 58-31.09c5.906 .9062 12.44 2.844 18.59 4.969c8.344 2.875 12.78 12 9.906 20.34c-2.875 8.344-11.94 12.81-20.34 9.906c-4.344-1.5-8.938-2.938-13.09-3.594c-11.19-1.656-20.72 .4062-21.5 4.906C375.2 219.2 385.6 221.5 396.4 224.6C413.4 229.5 445.1 238.5 439.3 271.9z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_COMMENT_SMS]. */
val FA_SMS = FA_COMMENT_SMS
